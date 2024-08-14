import java.util.ArrayList;

public class Path {
    public static void main(String[] args) {
        Path("",3,3);
        System.out.println(PathRet("",3,3));
        System.out.println(PathRetDia("",3,3));
    }
    static void Path(String p, int r, int c){
        if (r == 1 && c== 1){
            System.out.println(p);
            return;
        }
        if (r > 1){
            Path(p+'D',r-1,c);
        }
        if ( c > 1){
            Path(p+'R',r,c-1);
        }
    }
    // For Arraylist
    static ArrayList<String> PathRet(String p, int r, int c){
        if (r == 1 && c== 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1){
            ans.addAll(PathRet(p+'D',r-1,c));
        }
        if ( c > 1){
            ans.addAll(PathRet(p+'R',r,c-1));
        }
        return ans;
    }
    static ArrayList<String> PathRetDia(String p, int r, int c){
        if (r == 1 && c== 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1 && c > 1){
            ans.addAll(PathRetDia(p+'D',r-1,c-1));
        }
        if (r > 1){
            ans.addAll(PathRetDia(p+'V',r-1,c));
        }
        if ( c > 1){
            ans.addAll(PathRetDia(p+'H',r,c-1));
        }
        return ans;
    }

}
