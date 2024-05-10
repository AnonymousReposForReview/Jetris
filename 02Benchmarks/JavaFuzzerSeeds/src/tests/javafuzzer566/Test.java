package tests.javafuzzer566;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 05:59:13 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=59459L;
    public static double dFld=47.80118;
    public static boolean bFld=true;
    public short sFld=-15936;
    public volatile int iArrFld[]=new int[N];
    public static long lArrFld[][]=new long[N][N];
    public static volatile int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 2394L);
        FuzzerUtils.init(Test.iArrFld1, -60832);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f, int i4, float f1) {

        int i5=-36, i6=51207, i7=7, i8=-50371, i9=-30592;
        float f2=0.981F;
        byte by=52;
        double d=1.40063;
        long l=1672922936L;

        for (i5 = 3; i5 < 139; i5++) {
            f2 += (((i5 * i4) + i5) - i5);
            for (i7 = 1; i7 < 12; ++i7) {
                switch ((i7 % 4) + 46) {
                case 46:
                    Test.lArrFld[i5][(i6 >>> 1) % N] = 20145;
                    Test.instanceCount <<= by;
                    i4 += (((i7 * i5) + Test.instanceCount) - i7);
                    break;
                case 47:
                    d = 1;
                    while (++d < 2) {
                        i4 -= i5;
                        Test.dFld -= i4;
                        i8 ^= i7;
                    }
                    Test.instanceCount >>>= Test.instanceCount;
                    i4 >>= i9;
                    f2 += (((i7 * l) + Test.instanceCount) - by);
                    break;
                case 48:
                    Test.dFld += d;
                    break;
                case 49:
                    i6 += (i7 * i7);
                }
            }
        }
        vMeth2_check_sum += Float.floatToIntBits(f) + i4 + Float.floatToIntBits(f1) + i5 + i6 +
            Float.floatToIntBits(f2) + i7 + i8 + by + Double.doubleToLongBits(d) + i9 + l;
    }

    public static void vMeth1() {

        int i3=-120;
        float f3=0.537F;

        Test.dFld -= ((9091704005316460903L + (Test.instanceCount * -1.12F)) + ((33 * i3) + (Test.instanceCount * i3)));
        vMeth2(f3, 54143, f3);
        vMeth1_check_sum += i3 + Float.floatToIntBits(f3);
    }

    public static void vMeth(int i1, int i2) {

        int i10=10, i11=0, i12=6399, i13=0, i14=177, i15=-235;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)68);

        i2 = i1;
        vMeth1();
        i2 += i2;
        i2 += i1;
        for (i10 = 11; 199 > i10; i10++) {
            for (i12 = 1; i12 < 8; ++i12) {
                for (i14 = 1; i14 < 2; i14++) {
                    i1 = i11;
                    Test.instanceCount += (i14 ^ i10);
                    Test.instanceCount = i1;
                    Test.iArrFld1[i12 - 1] += i14;
                    i1 = 0;
                    byArr[i14] >>>= (byte)-2980;
                    i13 = (int)Test.instanceCount;
                }
                Test.lArrFld[i12][i12] *= -3809348632L;
            }
        }
        vMeth_check_sum += i1 + i2 + i10 + i11 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i=203, i16=21166, i17=32304, i18=-26599, i19=37063, i20=7, i21=6, i22=-148;
        float f4=6.814F, f5=-27.248F;

        i -= (iArrFld[(-232 >>> 1) % N]++);
        vMeth(i, -22558);
        i = i;
        i = (int)2.772F;
        for (i16 = 179; i16 > 10; i16 -= 2) {
            for (f4 = 1; 298 > f4; f4++) {
                for (i19 = 1; i19 < 2; i19++) {
                    short s=3352;
                    i17 >>= i17;
                    i17 = (int)Test.instanceCount;
                    i20 += (i19 * i19);
                    i20 = i17;
                    if (Test.bFld) break;
                    i20 = i16;
                    i20 -= -5;
                    i18 += i17;
                    if (Test.bFld) {
                        iArrFld = Test.iArrFld1;
                        Test.iArrFld1[(i20 >>> 1) % N] -= i17;
                        Test.dFld *= Test.instanceCount;
                        s <<= s;
                    }
                }
                for (i21 = (int)(f4); i21 < 2; i21++) {
                    f5 = f5;
                    Test.instanceCount += (-162 + (i21 * i21));
                    i18 = 2;
                    i22 = (int)f4;
                    iArrFld[(int)(f4 + 1)] -= -229;
                    i17 >>= i22;
                    Test.instanceCount = sFld;
                    if (Test.bFld) continue;
                    i22 = i21;
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