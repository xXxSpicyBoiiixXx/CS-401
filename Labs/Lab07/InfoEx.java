public class InfoEx {

    /*
     * Some basic implementations
     */

    private String info;

    /*
     * some other basic information
     */
    private String info2;

    /*
     * constructor for an InfoEx object
     * @param info --- some example info
     * @param info2 --- 2nd some example info
     */

    public InfoEx(String info, String info2){
        this.info = info;
        this.info2 = info2;
    }

    public String getInfo(){
        return this.info;
    }

    public String getInfo2(){
        return this.info2;
    }

    public String toString(){
        return this.info + " " + this.info2;
    }

}
