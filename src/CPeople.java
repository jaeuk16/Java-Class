public class CPeople {
    private String mFather;

    private  String mMother;

    private String mI;

    private int mLifeSpan;

    public CPeople(String mFather, String mMother, String mI, int mLifeSpan) {
        this.mFather = mFather;
        this.mMother = mMother;
        this.mI = mI;
        this.mLifeSpan = mLifeSpan;
    }

    public void mShow() {
        System.out.printf("아빠 이름 : %s, 엄마 이름 : %s, 내 이름 : %s, 수명 : %d\n" , mFather, mMother, mI, mLifeSpan);
    }
}


