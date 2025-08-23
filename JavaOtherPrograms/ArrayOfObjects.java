public class ArrayOfObjects {
    String name;
    int age;
ArrayOfObjects(String name, int age){
this.name=name;
this.age=age;
}

    public static void main(String args[]){
        ArrayOfObjects[] obj=new ArrayOfObjects[4];
        obj[0] =new ArrayOfObjects("Anju",20);
        obj[1]=new ArrayOfObjects("Preethi", 23);
        obj[2]=new ArrayOfObjects("Sho", 24);
        obj[3]=new ArrayOfObjects("San", 23);
        for(int i=0;i<obj.length;i++){
            System.out.println("Name :"+obj[i].name+" Age :"+obj[i].age);
        }
    }
}
