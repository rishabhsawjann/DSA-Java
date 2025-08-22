class Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array");
        size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the elements in the array");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
    }
}