public class rectangle {

    int area(int length, int width){
        return length*width;
    }
    int perimeter(int length, int width){
        return 2*(length + width);
    }
    public static void main(String[] args) {
        rectangle cal =new rectangle();
        System.out.println(cal.area(2, 3));
        System.out.println(cal.perimeter(2,3));

    }
    
}
