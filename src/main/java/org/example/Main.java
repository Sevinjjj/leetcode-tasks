package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//        int target = 9;
//        for (int i = 0; i<nums.length; i++){
//            for (int j = i + 1; j<nums.length; j++){
//                if(nums[i]+nums[j]==target){
//                    System.out.println("["+i+","+j+"]");
//                }
//            }
//        }
//
//        int[] nums = {3,2,4};
//        int target = 6;
//        for(int i=0; i<nums.length; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[i]+nums[j]==target){
//                    System.out.println("["+i+","+j+"]");
//                }
//            }
//        }
//
//        int[] nums = {3,3};
//        int target = 6;
//        for(int i=0; i<nums.length;i++){
//            for(int j=i+1;j<nums.length; j++){
//                if(nums[i]+nums[j]==target){
//                    System.out.println("["+i+","+j+"]");
//                }
//            }
//        }
//        int[] nums = {3,3};
//        int target = 6;
//        for(int i=0; i<nums.length;i++){
//            for(int j=0;j<nums[i].length; j++){
//                if(nums[i]+nums[j]==target){
//                    System.out.println("["+i+","+j+"]");
//                }
//            }
//        }

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Target daxil et:");
//        int target = scanner.nextInt();
//
//        ArrayList<Integer> nums = new ArrayList<>();
//        System.out.println("Nece eded daxil edeceksen?");
//        int count= scanner.nextInt();
//
//        System.out.print("Ededleri daxil et:");
//        for(int k=0; k<count; k++){
//            nums.add(scanner.nextInt());
//        }
//
//        for(int i=0; i<nums.size(); i++){
//            for(int j=i+1; j<nums.size(); j++){
//                if(nums.get(i)+nums.get(j)==target){
//                    System.out.println("["+i+","+j+"]");
//                }
//            }
//        }

//        public class Main {
//            public static void main(String[] args) {
//
//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Musbet eded daxil edin:");
//                int inputNum = scanner.nextInt();
//                while (inputNum < 0) {
//                    System.out.print("Musbext eded daxil edin:");
//                    inputNum = scanner.nextInt();
//                }
//                int[] inputArray = new int[inputNum];
//                int i = 0;
//                int j;
//                while (inputNum / 10 == 0) {
//                    j = inputNum % 10;
//                    inputArray[i] = j;
//                    inputNum = inputNum / 10;
//                }
//                int[] newInputArray = new int[inputArray.length];
//                i = 0;
//                while (i < newInputArray.length - 1) {
//                    newInputArray[i] = inputArray[i];
//                    i++;
//                }
//
//                i = 0;
//                j = newInputArray.length - 1;
//                while (i < j) {
//                    if (newInputArray[i] != newInputArray[j]) {
//                        System.out.println( inputNum + " Polindrom ");
//                        return ;
//                    }
//                    i++;
//                    j--;
//                }
//
//                //System.out.println(inputNum + " Polindromdur ");
//
//            }
//
//        }

//        int total = 0;
//        int prev  = 0;
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            char c = s.charAt(i);
//            int current;
//
//            switch (c) {
//                case 'I': current = 1;    break;
//                case 'V': current = 5;    break;
//                case 'X': current = 10;   break;
//                case 'L': current = 50;   break;
//                case 'C': current = 100;  break;
//                case 'D': current = 500;  break;
//                case 'M': current = 1000; break;
//                default:  throw new IllegalArgumentException(
//                        "Yanlış Roma rəqəmi: " + c);
//            }
//
//            if (current < prev) {
//                total -= current;
//            } else {
//                total += current;
//            }
//            prev = current;
//        }
//
//        return total;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String roman = scanner.nextLine();
//        System.out.println(roman + " ---> " + main(roman));
//        //III--->3
//        //LVIII--->58
//        //MCMXCIV--->1994

//        public static void main(String[] args) {
//            // String[] strs = {"flower", "flow", "flight" };
//            String[] strs = {"dog","racecar","car"};
//            String prefix = commonPrefix(strs);
//            System.out.println("Common prefix:" + " " + prefix);
//        }
//        public static String commonPrefix(String[] strs) {
//
//            String prefix = strs[0];
//            for (int i = 0; i < strs.length; i++) {
//                while (! strs[i].startsWith(prefix)) {
//                    prefix = prefix.substring(0,prefix.length() - 1);
//                    if (prefix.isEmpty()) return "";
//                }
//            }
//            return prefix;
//
//        }
    }
}