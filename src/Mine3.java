import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

public class Mine3 {
    public static void main(String[] args){
        File file = new File("onlyf2.txt");
        File fil = new File("experr3.txt");
        File fi = new File("zadaa1.txt");



        File files = new File("./");
        String[] list = files.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                boolean f = false;
                for (char i : name.toCharArray()){
                    if (".".contains(String.valueOf(i))){
                        break;
                    }
                    else if (!"0123456789".contains(String.valueOf(i))){
                        f = false;
                    }
                    else{
                        f = true;
                    }
                }
                int p = 0;
                for (char i : name.toCharArray()){
                    if ("0123456789".contains(String.valueOf(i))){
                        p += p*10+ ((int)i - 49);
                    }
                    else if (".".contains(String.valueOf(i))){
                        break;
                    }
                    else{
                        p = 0;
                    }
                }
                if (name.endsWith(".txt") && f){
                    return true;
                }
                return false;
            }
        });
        Arrays.sort(list, Comparator.comparing(Mine3::getbukv));
        System.out.println(Arrays.toString(list));
    }

    private static char getbukv(String str) {
        int kol = 4;
        for (char i : str.toCharArray()){
            if (".".contains(String.valueOf(i))){
                break;
            }
            else if (!"0123456789".contains(String.valueOf(i))){
                kol = 4;
            }
            else{
                kol++;
            }
        }
        System.out.println(str+kol);
        return str.charAt(str.length() - kol);
    }
}
