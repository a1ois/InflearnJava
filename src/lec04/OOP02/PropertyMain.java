package lec04.OOP02;

public class PropertyMain {

    public static void main(String[] args) {

        PropertyOfClass propertyOfClass = new PropertyOfClass();
        PropertyOfClass propertyOfClassHasName = new PropertyOfClass("커피");
        PropertyOfClass propertyOfClassHasNamePrice = new PropertyOfClass("바나나", "1500");
        propertyOfClassHasNamePrice.enumDataType = PropertyOfClass.EnumDataType.INSERT;

        System.out.println();
        System.out.println(propertyOfClass.toString());
        System.out.println(propertyOfClassHasName.toString());
        System.out.println(propertyOfClassHasNamePrice.toString());

        System.out.println();

        int getEntityCount = PropertyOfClass.entityCount;
        System.out.println("getEntityCount ::: " + getEntityCount);

        String[] innerClassPropertiesName = PropertyOfClass.InnerClassInfo.innerClassPropertiesName;
        for (String strVar : innerClassPropertiesName){
            System.out.println("strVar : " + strVar);
        }

        System.out.println();

        int[] innerClassPropertiesPrice = PropertyOfClass.InnerClassInfo.innerClassPropertiesPrice;
        for (int intVar : innerClassPropertiesPrice){
            System.out.println("intVar : " + intVar);
        }

    }

}
