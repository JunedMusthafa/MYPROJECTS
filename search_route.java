package Strings;
public class search_route{
    public static void main(String[] args) {
        //Given a route containing 4 directions (N,S,E,W) find the shortest path to reach the given route
        String route = "WNEENESENNN";
        int x=0,y=0;
        for(int i =0;i<route.length();i++){
            char dir=route.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }
            else if(dir=='W')
                x--;
        }
        System.out.printf("The destination is at index: (%d,%d)",x,y);
        int z = (x*x)+(y*y);
        double shortest_path = Math.sqrt(z);
        System.out.println("The shortest path is : "+shortest_path);
    }
}