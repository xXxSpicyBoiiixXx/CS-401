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
        private String location;
        private String population;
        private String description;

        public Station(String name, String code, String builtDate, String location, String population, String description)
        {
            this.name = name;
            this.code = code;
            this.builtDate = builtDate;
            this.location = location;
            this.population = population;
            this.description = description;
        }

        public String getName(){
            return name;
        }

        public String getCode(){
            return code;
        }

        public String getBuiltDate(){ return builtDate;}

        public String getLocation(){return location;}

        public String getPopulation(){return population;}

        public String getDescription(){return description;}

    }

    // Wherever your data is put that in your filepath
    private void readFile(){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("/home/mordecai/IdeaProjects/Final-Project/src/SpaceStationList.txt")))){
            String line;
            while((line = reader.readLine()) != null){
                String[] strs = line.split("#");
                Station station = new Station(strs[0], strs[1], strs[2], strs[3], strs[4], strs[5]);
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

        boolean choice = true;
        String exit;

        while(choice){
            System.out.println("Please enter the code: ");
            String code = scanner.nextLine();
            Station station = data.DataMap.get(code.toUpperCase());

            if(station == null){
                System.out.println("There is no space station with this code.");
                continue;
            }
            System.out.println("Station Code: "+station.getCode());
            System.out.println("Name: "+station.getName());
            System.out.println("Location: "+station.getLocation());
            System.out.println("Date Built: "+station.getBuiltDate());
            System.out.println("Population: "+station.getPopulation());
            System.out.println("Description: "+station.getDescription());

            System.out.println();
            System.out.println("Would you like to look up another station? (Y/N)");

            exit = scanner.nextLine();

            if(exit.equals("n") || exit.equals("N"))
            {
                choice = false;
            }
        }
    }
    }