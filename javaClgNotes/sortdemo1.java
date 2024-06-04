package javaClgNotes;
class sortdemo1{
    public static void main(String[] args) {
        String a[]={"a","x","s","c"};
        System.out.println("before sorting");
        for (String string: a) {
            System.out.println(string);
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if ((a[j].compareTo(a[j+1]))>0) {
                    String t=a[j];

                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
            
        }
        System.out.println("after sorting");
        for (String after : a) {
            System.out.println(after);
            
        }
    }
}
