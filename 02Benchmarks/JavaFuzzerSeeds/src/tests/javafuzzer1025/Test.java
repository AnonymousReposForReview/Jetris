package tests.javafuzzer1025;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:55:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4550967849820006693L;
    public int iFld=0;
    public int iFld1=-33114;
    public static boolean bFld=false;
    public double dFld=-114.15074;
    public volatile short sArrFld[][]=new short[N][N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(double d1) {

        byte by=117;
        float f1=0.871F;

        by -= (byte)f1;
        long meth_res = Double.doubleToLongBits(d1) + by + Float.floatToIntBits(f1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(float f, double d) {

        int i4=-53151, i5=168, i6=40852, i7=31, i8=-15526, i9=-119;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2747202446L);

        iFld = (++iFld);
        iFld &= (int)(Test.instanceCount + (iMeth1(d) + iFld));
        for (i4 = 16; i4 < 332; i4++) {
            Test.instanceCount *= i5;
            i5 += i4;
            for (i6 = 1; i6 < 5; ++i6) {
                if (i5 != 0) {
                    vMeth_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i4 + i5 + i6 + i7 + i8 +
                        i9 + FuzzerUtils.checkSum(lArr);
                    return;
                }
                lArr = lArr;
                lArr[i4 - 1] = -12;
                i5 += (i6 * Test.instanceCount);
                for (i8 = i4; i8 < 2; i8++) {
                    d += -40475;
                    i5 += (-13 + (i8 * i8));
                    i9 = (int)Test.instanceCount;
                    i7 = i5;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i4 + i5 + i6 + i7 + i8 + i9 +
            FuzzerUtils.checkSum(lArr);
    }

    public int iMeth(int i2, int i3) {

        float f2=-111.519F;
        double d2=92.37386;
        int i10=236, i11=3, i12=-7, iArr[]=new int[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 2367888466765814115L);
        FuzzerUtils.init(iArr, -49451);

        vMeth(f2, d2);
        i3 -= (int)d2;
        for (i10 = 1; i10 < 247; ++i10) {
            d2 += f2;
            Test.instanceCount <<= 33800;
            Test.instanceCount *= Test.instanceCount;
            if (Test.bFld) {
                i12 = 1;
                do {
                    i3 += i12;
                    i11 -= (int)Test.instanceCount;
                    lArr1[i12 - 1] += 19;
                    Test.instanceCount >>>= Test.instanceCount;
                    i3 += (-12 + (i12 * i12));
                    i2 >>= iFld1;
                    iArr = iArr;
                } while (++i12 < 7);
            } else {
                Test.instanceCount |= i11;
            }
        }
        long meth_res = i2 + i3 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d2) + i10 + i11 + i12 +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i1=-139, i13=70, i14=61438, i15=20858, i16=-11, i18=-60800, i19=-1, i20=151, i21=44, iArr1[]=new
            int[N];
        short s=-17853;
        byte by1=69;
        float f3=-2.210F;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, -57265L);
        FuzzerUtils.init(iArr1, 248);

        for (i = 9; i < 191; ++i) {
            int i17=20690;
            i1 = iMeth(i, iFld1);
            iFld1 += (i + Test.instanceCount);
            iFld1 = iFld1;
            iFld1 <<= (int)Test.instanceCount;
            for (i13 = 2; i13 < 138; ++i13) {
                iFld += s;
                i14 += iFld1;
                i15 = 1;
                while (++i15 < 2) {
                    iArr1[(iFld >>> 1) % N] <<= i1;
                    i14 |= i;
                    by1 = (byte)1.316F;
                    iArr1[i15 + 1] -= iFld1;
                    dFld += 11L;
                }
                i14 = i16;
                i16 -= (int)f3;
                iArr1[i13 - 1] = i16;
            }
            f3 += Test.instanceCount;
            if (Test.bFld) {
                iFld &= i17;
            } else {
                switch ((i % 10) + 38) {
                case 38:
                    iArr1[i] >>= i14;
                    s += (short)(i * i);
                    i16 += (i * i);
                    break;
                case 39:
                    iFld1 /= (int)(i16 | 1);
                    for (i18 = 2; i18 < 138; i18++) {
                        for (i20 = 1; i20 < 2; i20 += 3) {
                            i19 += iFld;
                            i21 += (int)dFld;
                        }
                        i1 &= 6053;
                    }
                    break;
                case 40:
                    i1 *= (int)Test.instanceCount;
                    break;
                case 41:
                case 42:
                    i1 <<= (int)Test.instanceCount;
                case 43:
                    if (false) continue;
                case 44:
                    s += (short)f3;
                    break;
                case 45:
                    iFld1 = i;
                    break;
                case 46:
                    lArr2[i] *= (long)dFld;
                    break;
                case 47:
                    sArrFld = sArrFld;
                    break;
                default:
                    Test.bArrFld = Test.bArrFld;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}