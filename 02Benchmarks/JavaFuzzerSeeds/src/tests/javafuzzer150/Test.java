package tests.javafuzzer150;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:03:45 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-19705L;
    public float fFld=95.312F;

    public static long vSmallMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i1=221, i2=21838, i3=53717, i4=-65484;
        float f1=116.921F;

        i1 = 335;
        do {
            i2 += (-7247 + (i1 * i1));
        } while ((i1 -= 3) > 0);
        for (i3 = 12; i3 < 377; ++i3) {
            boolean b1=true;
            Test.instanceCount += i3;
            if (b1) break;
            i2 |= (int)6818873471771117962L;
            if (b1) {
                if (b1) {
                    i4 *= (int)f1;
                    i4 += i3;
                    b1 = b1;
                } else if (b1) {
                    if (i2 != 0) {
                        vMeth_check_sum += i1 + i2 + i3 + i4 + Float.floatToIntBits(f1);
                        return;
                    }
                    vMeth_check_sum += i1 + i2 + i3 + i4 + Float.floatToIntBits(f1);
                    return;
                } else {
                    i4 ^= i2;
                    i4 += (i3 * i3);
                    i2 = (int)234L;
                }
            } else {
                i2 = (int)7697461265166389719L;
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + Float.floatToIntBits(f1);
    }

    public static boolean bMeth() {

        long l1=-2906471477L;
        int i5=6, i6=32076, i7=-172, i8=6, i9=229, i10=21325, i11=32400;
        float f2=0.838F;
        boolean b2=true;
        double d=0.4026;
        byte by=38;

        vMeth();
        for (l1 = 16; l1 < 257; l1++) {
            for (i6 = 1; i6 < 7; ++i6) {
                f2 += (-3 + (i6 * i6));
                b2 = b2;
                switch ((i6 % 2) + 9) {
                case 9:
                    try {
                        i7 = (i5 % i7);
                        i7 = (i6 / 56916);
                        i7 = (i5 % 1203692502);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 10:
                    for (i8 = 2; i8 > 1; --i8) {
                        i9 += (int)d;
                    }
                    i5 += (14 + (i6 * i6));
                }
                by += (byte)i5;
                Test.instanceCount -= (long)d;
                for (i10 = 2; i10 > 1; --i10) {
                    i9 *= (int)Test.instanceCount;
                    Test.instanceCount = i5;
                }
            }
        }
        long meth_res = l1 + i5 + i6 + i7 + Float.floatToIntBits(f2) + (b2 ? 1 : 0) + i8 + i9 +
            Double.doubleToLongBits(d) + by + i10 + i11;
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vSmallMeth(boolean b, float f, long l) {

        int i12=37222;

        bMeth();
        i12 *= 27204;
        vSmallMeth_check_sum += (b ? 1 : 0) + Float.floatToIntBits(f) + l + i12;
    }

    public void mainTest(String[] strArr1) {

        int i=65349, iArr[]=new int[N];
        boolean b3=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -6L);
        FuzzerUtils.init(iArr, 48002);

        i = -55515;
        lArr[(20414 >>> 1) % N] -= (long)(fFld * Math.max((int)(Test.instanceCount - -12), iArr[(i >>> 1) % N]));
        for (int smallinvoc=0; smallinvoc<981; smallinvoc++) vSmallMeth(b3, 0.45F, Test.instanceCount);



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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  bMeth ->  bMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth bMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}