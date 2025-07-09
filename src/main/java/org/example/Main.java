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


        Scanner scanner = new Scanner(System.in);
        System.out.print("Target daxil et:");
        int target = scanner.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Nece eded daxil edeceksen?");
        int count= scanner.nextInt();

        System.out.print("Ededleri daxil et:");
        for(int k=0; k<count; k++){
            nums.add(scanner.nextInt());
        }

        for(int i=0; i<nums.size(); i++){
            for(int j=i+1; j<nums.size(); j++){
                if(nums.get(i)+nums.get(j)==target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}