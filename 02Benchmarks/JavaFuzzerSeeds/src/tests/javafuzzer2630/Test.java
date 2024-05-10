package tests.javafuzzer2630;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 17:37:35 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=12L;
    public static float fFld=-77.922F;
    public static volatile double dFld=1.83207;
    public short sFld=-10285;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 38);
    }

    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d1, int i9) {


        i9 %= 18;
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i9;
    }

    public static void vMeth(int i1, long l) {

        int i2=-12372, i3=18942, i4=-12, i5=8, i6=94, i7=23692, i8=156, iArr[]=new int[N];
        byte by=110;
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -6438160244698824191L);
        FuzzerUtils.init(iArr, 9);

        i2 = 1;
        do {
            for (i3 = 1; i3 < 6; i3++) {
                for (i5 = 1; i5 < 2; i5++) {
                    i6 = (int)(-((i4 = (int)Test.instanceCount) - (by - i1)));
                    i1 += (i5 | (long)Test.fFld);
                    i4 += (i5 * i5);
                }
                for (i7 = 1; i7 < 2; i7++) {
                    vMeth1(-2.125583, i3);
                    Test.instanceCount += i3;
                    if (b) {
                        lArr = lArr;
                        iArr[i2 + 1] = i7;
                        i4 >>= i5;
                    } else {
                        i1 *= i2;
                        i4 >>= i7;
                    }
                }
            }
        } while (++i2 < 275);
        vMeth_check_sum += i1 + l + i2 + i3 + i4 + i5 + i6 + by + i7 + i8 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr);
    }

    public static byte byMeth() {

        boolean b1=false;
        int i10=169, i11=-16644, i12=-248, i13=-7, i14=-24, i15=-9;
        byte by1=-105;

        vMeth(-49757, Test.instanceCount);
        b1 = b1;
        for (i10 = 14; i10 < 264; ++i10) {
            for (i12 = i10; i12 < 7; i12++) {
                Test.instanceCount = i11;
                i11 += i11;
            }
        }
        i14 = 1;
        while ((i14 += 2) < 130) {
            Test.fFld += 3;
            i15 = 1;
            do {
                Test.dFld *= i13;
                if (i11 != 0) {
                }
                i11 = i13;
                i13 ^= by1;
                i11 += (int)Test.instanceCount;
                i13 += (-104 + (i15 * i15));
            } while (++i15 < 24);
        }
        long meth_res = (b1 ? 1 : 0) + i10 + i11 + i12 + i13 + i14 + i15 + by1;
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=2.38293;
        int i=21, i16=-15444, i17=-14188, i18=108, i19=24428, i20=-186, i21=-59, i22=8, iArr1[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -1.532F);
        FuzzerUtils.init(iArr1, -61735);

        d = 1;
        do {
            i = byMeth();
        } while (++d < 133);
        for (float f : fArr) {
            i16 = 1;
            do {
                for (i17 = 1; i17 < 1; i17++) {
                    Test.instanceCount = 7448303502857201576L;
                }
                i = i17;
                iArr1 = Test.iArrFld;
                i18 <<= i17;
                i = (int)Test.instanceCount;
                sFld += (short)(i16 | i17);
                iArr1[i16 + 1] >>= (int)52L;
                iArr1[i16] -= (int)Test.instanceCount;
                try {
                    i18 = (i17 % -50772);
                    i18 = (-149 % i18);
                    i18 = (17417 % iArr1[i16]);
                } catch (ArithmeticException a_e) {}
                i <<= -16;
            } while (++i16 < 63);
            switch ((((i18 >>> 1) % 7) * 5) + 3) {
            case 19:
                Test.instanceCount = Test.instanceCount;
                Test.instanceCount = i;
                break;
            case 18:
                sFld += (short)i16;
                for (i19 = 2; 63 > i19; ++i19) {
                    i20 = 203;
                    for (i21 = 1; i21 < 2; ++i21) {
                        boolean b2=true, b3=true;
                        Test.iArrFld = Test.iArrFld;
                        Test.fFld += i21;
                        i18 |= (int)2L;
                        i22 = (int)Test.instanceCount;
                        b2 = b3;
                        i20 += (int)(-21796L + (i21 * i21));
                        i20 += (-14 + (i21 * i21));
                    }
                    Test.instanceCount = Test.instanceCount;
                }
            case 7:
                sFld >>= (short)i20;
            case 21:
                i22 = i;
                break;
            case 30:
                i22 >>= i18;
            case 9:
                Test.instanceCount = i;
                break;
            case 12:
                i += i16;
            default:
                Test.iArrFld[(6341 >>> 1) % N] = (int)Test.dFld;
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
