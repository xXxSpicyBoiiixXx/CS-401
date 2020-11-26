import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class Read_Data {

    private Map<String, Station> DataMap = new HashMap<>();

    private class Station{
        private String name;
        private String code;
        private String builtDate;

        public Station(String name, String code, String builtDate)
        {
            this.name = name;
            this.code = code;
            this.builtDate = builtDate;
        }

        public String getName(){
            return name;
        }

        public String getCode(){
            return code;
        }

        public String getBuiltDate(){
            return builtDate;

        }
    }
    private void readFile(){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("SpaceStationList.txt")))){
            String line;
            while((line = reader.readLine()) != null){
                String[] strs = line.split("#");
                Station station = new Station(strs[0], strs[1], strs[2]);
                DataMap.put(station.getCode().toUpperCase(), station);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Read_Data data = new Read_Data();
        data.readFile();

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Please enter the code: ");
            String code = scanner.nextLine();
            Station station = data.DataMap.get(code.toUpperCase());

            if(station == null){
                System.out.println("There is no space station with this code.");
                continue;
            }
            System.out.println("Station name: "+station.getName());
            System.out.println("Station code: "+station.getCode());
            System.out.println("Station built date: "+station.getBuiltDate());
        }
    }
    }