public class switchkeyword {
    public static void main(String args[]){
        int day = 4;
        String dayName;
        switch(day){
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName ="Wednesday";
                    break;
                case 4:
                    dayName ="thursday";
                    break;
                case 5:
                    dayName ="friday";
                    break;
                case 6:
                    dayName ="saturday";
                    break;
                default:
                    dayName = "invalid day";
                    break;   

        }
        System.out.println(dayName);
    }
    
}
