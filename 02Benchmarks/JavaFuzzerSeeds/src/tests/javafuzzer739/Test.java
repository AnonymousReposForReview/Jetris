package tests.javafuzzer739;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:58:31 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4096915295698001043L;
    public static short sFld=-4184;
    public int iFld=37;
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f, int i4) {

        int i5=135, i6=7, i7=-131, i8=-46470, i9=-33093, i10=-158;
        boolean b=false;

        for (i5 = 5; i5 < 225; ++i5) {
            i4 <<= (int)Test.instanceCount;
            i6 &= (int)Test.instanceCount;
            for (i7 = 1; i7 < 7; i7 += 2) {
                i6 >>= i4;
                f -= f;
                Test.instanceCount += (((i7 * Test.instanceCount) + i6) - i7);
                i6 *= i7;
                f = i8;
                i8 = i6;
                for (i9 = 1; i9 < 3; i9++) {
                    i10 <<= (int)13L;
                    Test.bArrFld[i5 - 1] = b;
                    i6 >>= i8;
                    Test.instanceCount = i10;
                }
            }
        }
        vMeth2_check_sum += Float.floatToIntBits(f) + i4 + i5 + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0);
    }

    public static void vMeth1(int i1, long l) {

        int i2=-2, i3=-13253, i11=8, i12=5047;
        float f1=0.765F, f2=88.176F, fArr[]=new float[N];
        double d=-2.76032;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, -2.590F);
        FuzzerUtils.init(lArr, -1975L);

        for (i2 = 7; 218 > i2; ++i2) {
            Test.instanceCount += i2;
            vMeth2(f1, i1);
            i3 = i1;
            for (i11 = 1; i11 < 8; i11++) {
                fArr[i11 - 1] *= f1;
                l += i11;
            }
            f2 = 1;
            while (++f2 < 8) {
                lArr[i2 + 1] = (long)d;
                if (i11 != 0) {
                    vMeth1_check_sum += i1 + l + i2 + i3 + Float.floatToIntBits(f1) + i11 + i12 +
                        Float.floatToIntBits(f2) + Double.doubleToLongBits(d) + (b1 ? 1 : 0) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
                    return;
                }
                d += i1;
                Test.instanceCount += (long)((long)f2 ^ l);
                if (b1) break;
                i3 -= i1;
                l += -52;
            }
        }
        vMeth1_check_sum += i1 + l + i2 + i3 + Float.floatToIntBits(f1) + i11 + i12 + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(d) + (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i) {

        int i13=43, i14=-153, i15=49653, i16=-10, i17=-158, iArr[][]=new int[N][N];
        byte by=86;

        FuzzerUtils.init(iArr, 91);

        vMeth1(i, Test.instanceCount);
        Test.sFld += (short)i;
        i13 = 1;
        do {
            Test.instanceCount -= Test.instanceCount;
            for (i14 = 1; 6 > i14; i14++) {
                i15 += (-172 + (i14 * i14));
                for (i16 = i14; i16 < 2; ++i16) {
                    by >>= (byte)i17;
                    i17 = i13;
                    i17 = (int)Test.instanceCount;
                    iArr[i14 + 1] = iArr[i14 - 1];
                    i15 += (((i16 * Test.instanceCount) + Test.instanceCount) - i17);
                    Test.instanceCount += i;
                    i15 += i16;
                    i15 |= -5812;
                }
            }
        } while (++i13 < 275);
        vMeth_check_sum += i + i13 + i14 + i15 + i16 + i17 + by + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        long l1=3L;
        int i18=-29617, i19=20659, i20=-3, i21=-46589, i22=212, i23=6, i24=-127, i25=0, i26=-1, i27=-6, iArr1[]=new
            int[N];
        boolean b2=false;
        double d1=-105.57583;
        float f3=-1.822F, fArr1[]=new float[N];

        FuzzerUtils.init(iArr1, 14);
        FuzzerUtils.init(fArr1, 0.572F);

        vMeth(iFld);
        for (l1 = 1; l1 < 318; ++l1) {
            b2 = b2;
        }
        d1 = l1;
        i19 = 1;
        while (++i19 < 172) {
            i18 |= i18;
            iFld += (int)f3;
        }
        for (i20 = 3; i20 < 271; i20++) {
            iArr1[i20 + 1] *= -65268;
            for (i22 = i20; i22 < 94; i22++) {
                if (false) continue;
                i21 -= i22;
            }
            Test.instanceCount += (i20 * i20);
            i21 = (int)1.698F;
            i18 += (int)d1;
            iFld %= 47;
        }
        iFld *= i19;
        fArr1[(i20 >>> 1) % N] -= i23;
        Test.instanceCount = i18;
        i24 = 1;
        do {
            iFld -= iFld;
            Test.instanceCount = i21;
            Test.instanceCount >>= i22;
            for (i25 = i24; i25 < 65; i25++) {
                i27 = 1;
                do {
                    i26 += -5;
                    i26 = (int)100.125498;
                    Test.instanceCount ^= i23;
                } while ((i27 += 2) < 1);
                Test.instanceCount <<= l1;
            }
            iArr1[i24] -= i23;
        } while (++i24 < 387);



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
