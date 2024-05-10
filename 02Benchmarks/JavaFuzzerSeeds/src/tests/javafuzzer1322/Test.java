package tests.javafuzzer1322;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 18:16:05 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-90L;
    public float fFld=-39.40F;
    public volatile short sFld=3682;
    public static byte byFld=-5;
    public static double dFld=1.59736;

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i4=-109, i5=-9, i6=12, i7=98, i8=179, i9=10, i10=-46, i11=-2, iArr1[]=new int[N];
        float f=37.329F;
        double d=-2.24284;
        byte by=-72;

        FuzzerUtils.init(iArr1, 18);

        for (i4 = 1; i4 < 281; i4++) {
            i5 += i4;
        }
        i5 += -8;
        for (i6 = 9; i6 < 172; i6++) {
            for (i8 = 1; 10 > i8; ++i8) {
                i7 += (int)f;
            }
            for (i10 = 1; i10 < 10; ++i10) {
                iArr1[i6 + 1] -= (int)Test.instanceCount;
                i11 += i5;
                i5 = 53136;
                i9 += i5;
                i11 = i7;
                f *= (float)d;
                by += (byte)30405;
            }
        }
        iArr1 = FuzzerUtils.int1array(N, (int)-4);
        long meth_res = i4 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) + i10 + i11 + Double.doubleToLongBits(d)
            + by + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i2, int i3) {

        int i12=-138, i13=190, i14=-2, iArr[]=new int[N];
        boolean b=true;
        short s=-24867;
        float f1=-2.885F;
        byte by1=-67;

        FuzzerUtils.init(iArr, -2);

        iArr[(i2 >>> 1) % N] *= iMeth();
        i12 = 1;
        while (++i12 < 385) {
            if (b) break;
            i3 = i12;
            for (i13 = 1; i13 < 4; i13++) {
                Test.instanceCount = Test.instanceCount;
                switch (((-7 >>> 1) % 7) + 117) {
                case 117:
                    i14 += i13;
                    i2 += i13;
                    Test.instanceCount += (i13 + s);
                    break;
                case 118:
                    f1 = i2;
                    if (b) break;
                    i14 += (((i13 * i14) + i13) - f1);
                    i3 -= i14;
                    break;
                case 119:
                    i3 = by1;
                    break;
                case 120:
                    i2 >>= (int)Test.instanceCount;
                    break;
                case 121:
                    Test.instanceCount += -64026;
                    break;
                case 122:
                    i2 -= (int)f1;
                    break;
                case 123:
                    i3 <<= (int)-63608L;
                    break;
                default:
                    i2 <<= i12;
                }
            }
        }
        long meth_res = i2 + i3 + i12 + (b ? 1 : 0) + i13 + i14 + s + Float.floatToIntBits(f1) + by1 +
            FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        int i=-13, i1=142, i15=-4789, i16=49776;
        float f2=-2.311F;
        byte by2=-88;

        for (i = 10; i < 351; i++) {
            i1 += (int)lMeth(i1, i);
            i1 += i;
            Test.instanceCount <<= i1;
            i1 -= (int)-5794595018047524598L;
            i1 >>= i1;
            Test.instanceCount *= i;
            i1 >>= (int)Test.instanceCount;
            f2 += i1;
            i1 -= (int)Test.instanceCount;
        }
        for (i15 = 13; i15 < 365; i15++) {
            by2 += (byte)(((i15 * i16) + Test.instanceCount) - i16);
            f2 *= i;
        }
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f2) + i15 + i16 + by2;
    }

    public void mainTest(String[] strArr1) {

        int i17=54856, i18=-13, i19=3, i20=5, i21=31561, i22=-17314, i23=-6, i24=32115, i25=245, i26=-92, iArr2[]=new
            int[N];
        float f3=-1.214F;
        boolean b1=false;

        FuzzerUtils.init(iArr2, -8);

        vMeth();
        i17 = 1;
        do {
            i18 = (int)fFld;
            i19 = 1;
            do {
                i18 += (i19 - sFld);
                i18 >>= sFld;
                Test.byFld *= (byte)i18;
                Test.instanceCount >>>= i19;
                i18 -= (int)20.204F;
                i18 *= (int)Test.dFld;
                i18 <<= i19;
            } while (++i19 < 149);
            i18 -= i19;
            fFld = 69L;
            for (i20 = 6; i20 < 149; ++i20) {
                for (i22 = i20; i22 < 2; ++i22) {
                    Test.instanceCount /= -173;
                    Test.instanceCount = Test.instanceCount;
                }
                iArr2[i17] = -128;
                if (false) {
                    for (i24 = 1; 2 > i24; ++i24) {
                        iArr2[i20] += i25;
                        sFld -= (short)113530468016174056L;
                        i23 += (((i24 * sFld) + Test.instanceCount) - i22);
                        Test.instanceCount = Test.byFld;
                        Test.instanceCount >>= i20;
                        Test.instanceCount = (long)3.111638;
                    }
                } else if (false) {
                    for (f3 = 1; 2 > f3; f3 += 2) {
                        i25 -= (int)1.389F;
                        i26 -= i24;
                        Test.byFld += (byte)f3;
                    }
                } else if (b1) {
                    i23 += i23;
                } else {
                    Test.dFld = Test.dFld;
                }
            }
        } while (++i17 < 168);



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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}