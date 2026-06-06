public class truck {
    public static void main(String args[]){
        int packets[] = {6,9,17,8};
        int maxweight = 10;
        int totaltime = 10;
        int trips = 0;
        int cut = 0;
        for(int packet : packets){
            if(packet <= maxweight){
                trips++;
            }else{
                int trip = (int)Math.ceil((double)packet/maxweight);
                trips+= trip;
                cut += (trip-1); 
            }
        }
        int totaltimee = (trips * totaltime) + (cut * 5);
         System.out.println("Trips = " + trips);

        System.out.println("Cuts = " + cut);

        System.out.println("Total Time = " + totaltimee + " min");
    }
}