package tests.javafuzzer1340;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 18:32:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static float fFld=1.644F;
    public int iFld=4;
    public static float fArrFld[]=new float[N];
    public volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.341F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f) {

        int i1=28, i2=217, i3=173, i4=115, i5=-56, i6=13, iArr[]=new int[N];
        byte by=42;
        boolean b=true;
        short s=-2357;

        FuzzerUtils.init(iArr, -124);

        i1 >>= (int)Test.instanceCount;
        i1 = (int)f;
        for (i2 = 16; i2 < 326; ++i2) {
            i1 = i3;
            i4 = 1;
            do {
                double d=1.94859;
                long l1=139296370L;
                i3 = i2;
                f -= by;
                f = i2;
                i1 = 0;
                iArr[i4 + 1] /= (int)((long)(d) | 1);
                for (i5 = 1; i5 > i2; i5--) {
                    i1 -= i3;
                }
                if (b) continue;
                by = (byte)l1;
            } while (++i4 < 5);
            Test.instanceCount *= s;
        }
        vMeth2_check_sum += Float.floatToIntBits(f) + i1 + i2 + i3 + i4 + by + i5 + i6 + (b ? 1 : 0) + s +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1() {

        int i7=152, i8=9, i9=186, i10=5993, i11=14, i12=-3, i13=-240, iArr1[]=new int[N];
        double d1=2.6051;
        long lArr[]=new long[N], lArr1[]=new long[N];

        FuzzerUtils.init(lArr, -11L);
        FuzzerUtils.init(lArr1, 157L);
        FuzzerUtils.init(iArr1, 48900);

        for (long l : lArr) {
            vMeth2(Test.fFld);
            switch (((53643 >>> 1) % 1) + 7) {
            case 7:
                i7 = (int)Test.instanceCount;
                lArr1[(-166 >>> 1) % N] += (long)d1;
                Test.fArrFld[(i7 >>> 1) % N] += i7;
                i7 += (int)d1;
            default:
                for (i8 = 1; i8 < 4; ++i8) {
                    i7 >>>= (int)l;
                }
                for (i10 = 1; i10 < 4; ++i10) {
                    for (i12 = 1; i12 < 2; i12++) {
                        i9 = 13;
                        i13 = i11;
                        i13 -= i7;
                    }
                    iArr1[i10 + 1] = i7;
                }
            }
        }
        vMeth1_check_sum += i7 + Double.doubleToLongBits(d1) + i8 + i9 + i10 + i11 + i12 + i13 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        long l2=-624053489L;
        int i14=-157, iArr2[][]=new int[N][N];
        short s1=-14018;

        FuzzerUtils.init(iArr2, -13);

        vMeth1();
        for (l2 = 17; l2 < 350; ++l2) {
            i14 -= 10;
            i14 += (int)(l2 * l2);
            s1 <<= (short)i14;
            i14 -= i14;
            iArr2[(int)(l2 + 1)][(int)(l2 + 1)] ^= -55974;
        }
        vMeth_check_sum += l2 + i14 + s1 + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=-46527, i15=173, i16=7859, i17=-237, i18=-14, i19=-12, i20=37676;
        short s2=-7283;
        byte by1=-26;

        i = 1;
        do {
            vMeth();
            iFld = s2;
            Test.fFld += (i * i);
            iFld = i;
        } while (++i < 185);
        for (i15 = 3; i15 < 209; ++i15) {
            for (i17 = 122; i17 > i15; i17--) {
                switch ((i17 % 1) + 89) {
                case 89:
                    Test.fFld -= i15;
                    Test.instanceCount *= Test.instanceCount;
                    break;
                default:
                    for (i19 = 1; i19 > i17; i19--) {
                        long l3=2L;
                        iFld -= iFld;
                        Test.instanceCount += (i19 ^ i17);
                        iArrFld[i15 - 1] >>= -8;
                        i18 = by1;
                        switch ((((i18 >>> 1) % 3) * 5) + 98) {
                        case 105:
                            i16 -= (int)Test.instanceCount;
                            i20 += i17;
                            break;
                        case 106:
                            l3 *= i;
                            i16 -= i16;
                            i18 = (int)-58.840F;
                            break;
                        case 100:
                            l3 += i15;
                            i16 <<= -33;
                            l3 -= l3;
                            i20 += (((i19 * Test.fFld) + i17) - i15);
                        }
                        iArrFld[(iFld >>> 1) % N] >>= i17;
                        iArrFld[i15] = i;
                        iFld *= iFld;
                        Test.fFld += 2822134954835270307L;
                    }
                    i16 += (i17 * Test.instanceCount);
                }
            }
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
