package tests.javafuzzer606;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:28:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3L;
    public static volatile double dFld=-50.119400;
    public short sFld=-7154;
    public static volatile float fArrFld[]=new float[N];
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -1.18F);
        FuzzerUtils.init(Test.iArrFld, -170);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(int i5, short s, long l) {

        int i6=-15365, i7=60703, i8=-13, i9=-6, i10=-1, i11=6272, i12=-3, iArr[]=new int[N];
        byte by=37;

        FuzzerUtils.init(iArr, 201);

        i5 <<= i5;
        iArr[(i5 >>> 1) % N] = (int)Test.instanceCount;
        for (i6 = 16; i6 < 372; i6++) {
            l += (i6 + i7);
            i7 += (((i6 * i6) + i5) - l);
            i5 = i6;
            for (i8 = 5; 1 < i8; i8--) {
                i5 /= -56;
                l /= (by | 1);
                Test.instanceCount += 29377;
                i9 += (i8 ^ i8);
                for (i10 = 2; 1 < i10; i10--) {
                    Test.instanceCount += i10;
                    i12 |= 42534;
                    i11 += 104;
                }
            }
        }
        long meth_res = i5 + s + l + i6 + i7 + i8 + i9 + by + i10 + i11 + i12 + FuzzerUtils.checkSum(iArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth1() {

        int i3=199, i4=1, i13=5261, i14=-6, iArr1[]=new int[N];
        short s1=2763;
        double d=63.96432;
        float f2=90.991F;

        FuzzerUtils.init(iArr1, -5);

        for (i3 = 11; i3 < 325; i3++) {
            float f1=-2.347F;
            f1 *= byMeth(i4, s1, Test.instanceCount);
            for (i13 = 1; i13 < 5; ++i13) {
                Test.instanceCount *= (long)d;
                Test.instanceCount += (((i13 * i4) + f1) - Test.instanceCount);
                iArr1[i13 + 1] += 199;
                i4 = 243;
                d = i14;
                Test.instanceCount += (60L + (i13 * i13));
                i4 = i14;
            }
            i14 -= i4;
            iArr1[i3] <<= (int)-37643L;
        }
        i14 += i13;
        f2 -= Test.instanceCount;
        i4 = i14;
        vMeth1_check_sum += i3 + i4 + s1 + i13 + i14 + Double.doubleToLongBits(d) + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i=873, i1=-186, i2=40308, i16=-48217, i17=106;
        float f=-50.195F;
        short s2=12802;
        boolean b=true;

        i = 109;
        i *= (int)(++f);
        for (i1 = 8; 396 > i1; i1++) {
            vMeth1();
            s2 -= (short)f;
            i2 += i1;
            for (i16 = 1; i16 < 4; i16++) {
                i = (int)Test.dFld;
                i2 *= (int)f;
            }
            i2 += (int)(-125.880F + (i1 * i1));
            i17 += (int)f;
            b = b;
            Test.instanceCount -= -11;
            i *= -8;
        }
        i2 ^= i17;
        vMeth_check_sum += i + Float.floatToIntBits(f) + i1 + i2 + s2 + i16 + i17 + (b ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i18=-9, i19=46668, i20=-154, i21=-181, i22=-82, i23=-11, i24=58, i25=-222, i26=64117;
        boolean b1=false;
        float f4=1.120F;

        vMeth();
        for (i18 = 18; i18 < 328; ++i18) {
            i20 = 1;
            do {
                i19 += i19;
                for (i21 = 1; 1 > i21; ++i21) {
                    if (b1) continue;
                }
            } while (++i20 < 81);
            i23 = 81;
            while (--i23 > 0) {
                i22 -= -252;
                i24 = 1;
                while (++i24 < 1) {
                    i22 = i24;
                    Test.iArrFld[i24 - 1] += i24;
                    Test.instanceCount -= i20;
                }
                i22 += (((i23 * i21) + sFld) - i23);
                i22 -= (int)Test.instanceCount;
                for (i25 = 1; i25 < 1; i25++) {
                    i26 += i20;
                    f4 *= -109;
                    i22 = i18;
                    if (b1) continue;
                    Test.iArrFld = Test.iArrFld;
                    switch ((i23 % 2) + 2) {
                    case 2:
                        Test.instanceCount += (((i25 * i20) + i23) - Test.instanceCount);
                        i19 >>= i22;
                        f4 += (i25 + i22);
                        break;
                    case 3:
                        if (b1) continue;
                        i26 <<= i24;
                        Test.iArrFld[i18] = (int)Test.instanceCount;
                        break;
                    default:
                        try {
                            Test.iArrFld[i25 - 1] = (207 / i24);
                            i26 = (i26 / i22);
                            Test.iArrFld[i23] = (i23 % 3993);
                        } catch (ArithmeticException a_e) {}
                        if (b1) continue;
                        Test.instanceCount *= i21;
                    }
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
//DEBUG  byMeth ->  byMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
