package tests.javafuzzer2386;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 13:58:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-55044L;
    public byte byFld=127;
    public static volatile byte byFld1=31;
    public static short sFld=27061;
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-62);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i7=60852, i8=-44, i9=-143, i10=35980, i11=119, i12=32370, i13=11, iArr[]=new int[N];
        byte by=17;
        float f=105.339F, fArr[]=new float[N];
        boolean b=false;
        double d1=-21.105657;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 33809L);
        FuzzerUtils.init(fArr, 1.409F);
        FuzzerUtils.init(iArr, 154);

        for (i7 = 9; i7 < 302; ++i7) {
            i8 += i7;
            fArr[i7 - 1] += i8;
            by += (byte)(((i7 * f) + Test.instanceCount) - i8);
            for (i9 = i7; 6 > i9; i9++) {
                if (b) break;
                f += i9;
                d1 = i8;
                f *= -74;
                if (i9 != 0) {
                    vMeth1_check_sum += i7 + i8 + by + Float.floatToIntBits(f) + i9 + i10 + (b ? 1 : 0) +
                        Double.doubleToLongBits(d1) + i11 + i12 + i13 + FuzzerUtils.checkSum(lArr) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
                    return;
                }
            }
            for (i11 = 1; i11 < 6; i11++) {
                i8 -= i13;
                iArr[i11] &= i12;
                d1 *= d1;
                i8 -= (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += i7 + i8 + by + Float.floatToIntBits(f) + i9 + i10 + (b ? 1 : 0) +
            Double.doubleToLongBits(d1) + i11 + i12 + i13 + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i5, int i6) {

        int i14=0, i15=13, i16=-8, i17=10, i18=-13, iArr1[]=new int[N];
        double d2=99.30400;
        float f1=0.651F;
        short s=8976;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, 8);
        FuzzerUtils.init(lArr1, 180L);

        vMeth1();
        for (i14 = 123; i14 > 4; i14--) {
            if (false) continue;
            try {
                i15 = (-27653 % iArr1[i14 + 1]);
                iArr1[i14 - 1] = (i14 % i6);
                i5 = (i15 / -232);
            } catch (ArithmeticException a_e) {}
            Test.byArrFld[i14] += (byte)i5;
            Test.instanceCount += (((i14 * Test.byFld1) + i6) - i14);
            for (i16 = 1; i16 < 13; i16++) {
                d2 -= f1;
                lArr1[i14 + 1] <<= Test.instanceCount;
                Test.instanceCount |= Test.instanceCount;
                Test.instanceCount = Test.instanceCount;
                i18 = 2;
                while (--i18 > 0) {
                    Test.instanceCount = s;
                    Test.instanceCount |= i6;
                }
                i15 += i16;
            }
        }
        vMeth_check_sum += i5 + i6 + i14 + i15 + i16 + i17 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f1) +
            i18 + s + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
    }

    public static float fMeth(int i3, int i4) {

        long l1=5636L, lArr2[]=new long[N];
        int i19=13, i20=-1, i21=43, i22=4928, i23=2, iArr2[]=new int[N];
        float f2=0.877F;
        boolean b1=false;

        FuzzerUtils.init(iArr2, 0);
        FuzzerUtils.init(lArr2, 59L);

        vMeth(-47136, i4);
        for (l1 = 3; l1 < 221; ++l1) {
            for (i20 = 1; 7 > i20; ++i20) {
                for (i22 = 2; l1 < i22; i22--) {
                    Test.instanceCount -= i19;
                    iArr2[(int)(l1)] = -246;
                    Test.instanceCount <<= Test.instanceCount;
                    i19 += (-168 + (i22 * i22));
                    i3 -= (int)f2;
                    Test.instanceCount -= i22;
                    lArr2[i22 - 1] >>= 2979;
                    i19 += Test.sFld;
                }
            }
            i3 += (int)(((l1 * i20) + Test.instanceCount) - i23);
            Test.byFld1 = (byte)-6076481865750085665L;
            if (b1) break;
        }
        long meth_res = i3 + i4 + l1 + i19 + i20 + i21 + i22 + i23 + Float.floatToIntBits(f2) + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr2);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=17, i1=22, i2=-12;
        double d=2.13217;

        i = 1;
        while (++i < 216) {
            i1 >>>= (int)((44136 + (i + i)) + 0.91895);
            i2 = 1;
            do {
                i1 += (i2 * i2);
            } while (++i2 < 116);
            d -= i;
            byFld = (byte)((fMeth(i, 0) + Test.instanceCount) % 14L);
            d -= 0;
            if (true) continue;
        }



    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
