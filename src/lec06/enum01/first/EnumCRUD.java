package lec06.enum01.first;

public enum EnumCRUD { // Create, Read, Update, Delete

    CREATE(1, "저장"), READ(2, "읽기"), UPDATE(3, "수정"), DELETE(4, "삭제");

    private int intValue;
    private String strName;

    private EnumCRUD(int intValue, String strName){
        this.intValue = intValue;
        this.strName = strName;
    }

    public int getIntValue() { // 위에서 set 해주기에 setter 은 필요 없다
        return intValue;
    }

    public String getStrName() {
        return strName;
    }
}
