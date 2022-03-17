package com.company;
//import java.sql.SQLOutput;

public class Basic {

    public static void main(String[] args) {
//         System.out.println();
//         float age=2.5f;
//         int age2=56;
//         String ch="hello";
//         System.out.println(ch);

//        User input in java
//        System.out.println("Enter the input by user");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the first number");
//        int a=sc.nextInt();
//        System.out.println("enter the first number");
//        int b=sc.nextInt();
//        int c =a+b;
//        System.out.println(c);

//        boolean b1=sc.hasNextFloat();
//        System.out.println(b1);
//        String st=sc.next();
//        String st= sc.nextLine();
//        System.out.println(st);


//        Exercise->1
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the maths mark");
//        int a=sc.nextInt();
//        System.out.println("Enter the pysics mark");
//        int b=sc.nextInt();
//        System.out.println("Enter the chemistry mark");
//        int c=sc.nextInt();
//        System.out.println("Enter the english mark");
//        int d=sc.nextInt();
//        System.out.println("Enter the computer mark");
//        int e=sc.nextInt();
//        System.out.println("Total precentage are");
//        float p=(a+b+c+d+e)/500f*100f;
//        System.out.println(p);


//        operator
//        int a=47;
//        float b=a%3f;
//        System.out.println(b);

//        Scanner sc=new Scanner(System.in);
//        String name=sc.next();
//        System.out.println("Hello"+ name +"how are you?");


//        int a=5;
//        float b=6.54f+a;
//        System.out.println(b);

//        Incremental & Decremental
//        int a=25;
//        System.out.println(++a);
//        System.out.println(a);

//        char ch='A';
//        System.out.println(++ch);

//        String Java
//        String str=new String("anuj");
//        String str="anuj";
//        System.out.println(str);
//          int a=5;
//          float b=7.25f;
//        System.out.printf("enter the name a is %d nd b is %5.2f", a,b);

//        String method
//        String str="anuja VAGHANI";
//        System.out.println(str.length());
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        System.out.println(str.trim());
//        System.out.println(str.substring(2));
//        System.out.println(str.substring(2,9));
//        System.out.println(str.replace('j','u'));
//        System.out.println(str.startsWith("anuj"));
//        System.out.println(str.endsWith("ni"));
//        System.out.println(str.charAt(5));
//        System.out.println(str.indexOf('a'));
//        System.out.println(str.indexOf('a',1));
//        System.out.println(str.lastIndexOf('a'));
//        System.out.println(str.equals("anuja VAGHANI"));
//        System.out.println(str.equalsIgnoreCase("anuja VAGhANI"));

//        conditionals
//         int a=15;
//         if(a>15){
//             System.out.println("age is less");
//         }
//         else{
//             System.out.println("age are ready");
//         }
//          Switch Case
//        int age=25;
//        switch (age) {
//            case 15 -> System.out.println("age are ready");
//            case 18 -> System.out.println("age is 18");
//            default -> System.out.println("age are not " + age);
//        }

//        Loop
//        While Loop
//        int i = 1;
//        while (i < 15) {
//            System.out.println(i);
//            i++;
//        }

//      For Loop
//       for(i=0;i<5;i++){
//           System.out.println(i);
//       }

//        Do-While Loop
//        int i=0;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<15);

//        Break And Continue
//         int c=0;
//        System.out.println("starting...");
//        while(c<5){
//            System.out.println("printg");
//            System.out.println(c);
//            if(c==2){
//                System.out.println("stop a loop");
//                break;
//            }
//            c++;
//        }

//        int i=0;
//        do{
//            i++;
//            if(i==2){
//                System.out.println("ENDING A LOOP");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java ");
//        }while(i<5);

//        int n=5;
//        int i=1;
//        int f=1;
//       while(i<=n){
//            f=f*i;
//            i++;
//        }
//        System.out.println(f);

//        int n=5;
//        for(int i=n;i>0;i--){
//            for(int j=0;j<i;j++) {
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }

//        int sum=0;
//        int n=3;
//        for(int i=0;i<n;i++){
//            sum=sum+(2*i);
//        }
//        System.out.println(sum);

//        Arrays
//        total three type arrays syntext

//        1->
//        int [] marks=new int[6];
//        marks[0]=25;
//        marks[1]=25;
//        marks[2]=25;
//        marks[3]=25;
//        marks[4]=255;
//        marks[5]=25;
//        System.out.println(marks[4]);

//        2->
//        int [] marks;
//        marks=new int[6];
//        marks[0]=25;
//        marks[1]=25;
//        marks[2]=25;
//        marks[3]=25;
//        marks[4]=255;
//        marks[5]=25;
//        System.out.println(marks[4]);

//        3->
//        int [] marks={100,200,300,400,500};
//        System.out.println(marks[2]);

//        int [] marks={100,200,300,400,500};
//        float [] markd={10.0f,20.6f,256.2f};
//        System.out.println(marks.length);

//        int [] marks={100,200,300,400,500};
//        for (int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
//        Reverse-order loop
//        for(int i=marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }
//        For-each loop
//        for(int element:marks){
//            System.out.println(element);
//        }

//         int [][] floats;
//         floats= new int [2][3];
//         floats[0][0]=101;
//         floats[0][1]=102;
//         floats[0][2]=103;
//         floats[1][0]=201;
//         floats[1][1]=202;
//         floats[1][2]=202;
//          for(int i=0;i<floats.length;i++) {
//         for (int j = 0; j < floats[i].length; j++) {
//             System.out.print(floats[i][j]);
//             System.out.print(" ");
//         }
//         System.out.println("");
//     }

//    int [] arr={100,200,300,400,500};
//    int sum=0;
//    for (int i=0;i<arr.length;i++){
//    sum=sum+arr[i];
//}
//        System.out.println(sum);
//
//        float [] marks={50.0f,45.5f,56.0f};
//        float sum=0;
//          for(float element:marks) {
//              sum = sum + element;
//          }
//             System.out.println("total marks sum are "+sum/ marks.length);

//        Math function used
//        float a=Math.floorDiv(10,3);
//        System.out.println(a);

//        swap two number
//        int [] arr={20,30,40,50,60,70};
//        int l=arr.length;
//        int temp;
//        int n=Math.floorDiv(l,2);
//        for (int i=0;i<n;i++){
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//    for (int element:arr){
//        System.out.println(element);
//      }

//        Array Maximum element
//        int [] arr={20,30,40,50,60,70};
//        int max=0;
//        int max=Integer.MAX_VALUE;  number are find minimum are used
//        for (int element:arr){
//          if(element<max){
//              max=element;
//          }
//        }
//        System.out.println("maximun number are "+max);

//       sort array find
//        int [] a={10,5,80,25,65,45};
//        int[] a = {5, 10, 15, 20, 25, 60};
//        boolean sort = true;
//        for (int i = 0; i < a.length - 1; i++) {
//            if (a[i] > a[i + 1]) {
//            sort = false;
//            break;
//        }
//    }
//    if(sort){
//        System.out.println("array are sorted");
//    } else
//    {
//        System.out.println("array are not sorted");
//    }



  }
}