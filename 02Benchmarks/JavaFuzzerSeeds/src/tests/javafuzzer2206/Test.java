package tests.javafuzzer2206;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:16:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2211572190L;
    public static double dFld=0.33580;
    public static short sFld=27859;
    public int iFld=841;
    public static float fFld=53.620F;
    public static volatile byte byFld=69;
    public static long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -23499L);
        FuzzerUtils.init(Test.fArrFld, -110.560F);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vSmallMeth(boolean b, int i) {


        i -= (int)Test.dFld;
        vSmallMeth_check_sum += (b ? 1 : 0) + i;
    }

    public static void vMeth(int i5, double d) {

        boolean b1=false;
        float f2=0.842F;
        int i6=-2, i7=1, i8=-54190, i9=29644, i10=63763, i11=47, i12=-124, iArr[]=new int[N];
        double d1=-42.52333;

        FuzzerUtils.init(iArr, 162);

        vSmallMeth(b1, i5);
        if (b1) {
            iArr[(i5 >>> 1) % N] += i5;
            Test.instanceCount += (long)f2;
        } else if (b1) {
            for (i6 = 10; i6 < 222; i6++) {
                iArr[i6] += (int)d;
                iArr[i6 - 1] = (int)Test.instanceCount;
                for (d1 = 1; d1 < 8; d1 += 2) {
                    for (i9 = i6; i9 < 3; ++i9) {
                        i10 += i9;
                        iArr[(int)(d1 + 1)] >>= 12024;
                    }
                }
                for (i11 = 1; i11 < 8; i11++) {
                    i12 += (int)(-1.496F + (i11 * i11));
                    iArr[i11 + 1] %= (int)((long)(f2) | 1);
                    iArr[i6 - 1] = (int)-2985819239L;
                }
            }
        }
        vMeth_check_sum += i5 + Double.doubleToLongBits(d) + (b1 ? 1 : 0) + Float.floatToIntBits(f2) + i6 + i7 +
            Double.doubleToLongBits(d1) + i8 + i9 + i10 + i11 + i12 + FuzzerUtils.checkSum(iArr);
    }

    public static float fMeth(int i1, int i2, float f) {

        int i3=215, i4=-31403, i13=-44338;
        float f1=124.639F;
        long l=-54172L;

        for (i3 = 6; i3 < 242; i3++) {
            f1 = 1;
            while (++f1 < 7) {
                i2 += (int)f1;
                Test.dFld = 0;
                vMeth(i3, 116.54167);
                i2 *= i2;
                Test.lArrFld[i3 + 1] *= i3;
                i4 <<= i4;
                Test.lArrFld[(int)(f1)] += i4;
                for (l = (long)(f1); 1 > l; l++) {
                    switch ((int)((f1 % 2) + 64)) {
                    case 64:
                        i4 = (int)Test.instanceCount;
                        i2 += (int)(((l * Test.instanceCount) + i1) - i2);
                        Test.fArrFld[(int)(f1 - 1)] -= 2.616F;
                        Test.instanceCount += (l - i3);
                        break;
                    case 65:
                        f *= Test.sFld;
                        break;
                    default:
                        f -= f1;
                    }
                }
            }
        }
        long meth_res = i1 + i2 + Float.floatToIntBits(f) + i3 + i4 + Float.floatToIntBits(f1) + l + i13;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i14=-7, i15=39851, i16=32485, i17=-95, i18=38695, i19=136, i20=51750, i21=14, i22=-19156, iArr1[]=new
            int[N];
        boolean b2=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, 33981);
        FuzzerUtils.init(dArr, -4.21905);

        for (int smallinvoc=0; smallinvoc<610; smallinvoc++) vSmallMeth((++Test.instanceCount) < (fMeth(iFld, iFld,
            Test.fFld) - iFld), iFld);
        iArr1 = FuzzerUtils.int1array(N, (int)32297);
        for (i14 = 11; i14 < 198; ++i14) {
            for (i16 = 1; i16 < 134; i16++) {
                Test.instanceCount = Test.instanceCount;
                Test.lArrFld[i16] >>= Test.instanceCount;
                for (i18 = 2; i18 > 1; i18--) {
                    Test.instanceCount = Test.sFld;
                    b2 = b2;
                    iArr1[i18 + 1] = (int)Test.instanceCount;
                }
                iFld = 7;
                for (i20 = 1; i20 < 2; ++i20) {
                    i21 = iFld;
                    switch ((i20 % 3) + 87) {
                    case 87:
                        iArr1[i16] <<= i20;
                    case 88:
                        Test.fFld += Test.instanceCount;
                        Test.dFld = Test.sFld;
                        i19 = i15;
                        break;
                    case 89:
                        iFld += (((i20 * i20) + Test.fFld) - Test.sFld);
                        i17 -= iFld;
                        Test.fFld = i15;
                        break;
                    default:
                        dArr[i16 + 1] = Test.fFld;
                        Test.instanceCount <<= i14;
                        dArr = FuzzerUtils.double1array(N, (double)-112.104392);
                    }
                    Test.fFld += i15;
                    Test.sFld *= Test.byFld;
                    Test.instanceCount += (i20 * i20);
                    Test.sFld -= (short)i18;
                    i19 += (((i20 * i16) + i16) - i22);
                    iArr1[i20] *= (int)Test.fFld;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test vMeth fMeth
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}