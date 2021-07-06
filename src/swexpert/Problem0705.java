package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem0705 {
    private static class Child {
        int a, b;
        Child(int n1, int n2) { a = n1; b = n2; }
    }

    private static class Children {
        Child left, right;
        Children(Child l, Child r) { left = l; right = r; }
    }

    private static Children getChildren(Child root){
        Child left = new Child(root.a, root.a + root.b);
        Child right = new Child(root.a + root.b, root.b);

        return new Children(left, right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < T; tc++){
            String line = br.readLine();
            String[] cmdList = line.split("");

            Child currentroot = new Child(1, 1);

            for(int i = 0; i < cmdList.length; i++){
                if(cmdList[i].equals("L")){
                    currentroot = getChildren(currentroot).left;
                }else if(cmdList[i].equals("R")){
                    currentroot = getChildren(currentroot).right;
                }
            }

            System.out.println(String.format("#%d %d %d", tc + 1, currentroot.a, currentroot.b));

        }
    }
}
