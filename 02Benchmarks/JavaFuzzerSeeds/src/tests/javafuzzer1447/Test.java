package tests.javafuzzer1447;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 20:49:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=19399L;
    public static int iFld=11;
    public static short sFld=-19718;
    public static boolean bFld=false;
    public volatile double dFld=2.100247;
    public float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 11259);
        FuzzerUtils.init(Test.byArrFld, (byte)0);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(long l2, float f1, double d1) {

        byte by1=15;
        int i4=-9, i5=-8, i6=-42, i7=-17747, i8=-153, i9=7;
        boolean b=true;

        by1 -= (byte)l2;
        if (true) {
            Test.iFld &= Test.iFld;
        } else if (b) {
            f1 += by1;
            for (i4 = 4; i4 < 172; ++i4) {
                for (i6 = 1; i6 < 9; ++i6) {
                    i5 %= (int)(i6 | 1);
                    Test.instanceCount -= l2;
                    i7 += i5;
                    Test.iArrFld = Test.iArrFld;
                    i7 += (i6 * i6);
                    for (i8 = 1; i8 < 2; i8 += 3) {
                        i5 <<= i6;
                        i5 <<= i4;
                        f1 += i8;
                    }
                }
            }
        }
        long meth_res = l2 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + by1 + i4 + i5 + i6 + i7 + i8 + i9
            + (b ? 1 : 0);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth1(int i3, long l, long l1) {

        float f2=-2.493F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 8375239958960971257L);

        i3 *= (int)(lArr[(i3 >>> 1) % N] - byMeth(l, f2, -82.28916));
        vMeth1_check_sum += i3 + l + l1 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i1, double d) {

        byte by=107;
        float f=84.589F, fArr[]=new float[N];
        int i2=-48166, i10=231, i11=108;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 5899592743063450274L);
        FuzzerUtils.init(fArr, -87.565F);

        by += (byte)i1;
        for (f = 182; f > 11; --f) {
            float f3=0.117F;
            vMeth1(i2, 4268557981L, Test.instanceCount);
            i2 = 11378;
            i1 *= Test.sFld;
            f3 *= (float)d;
        }
        Test.iFld = i1;
        Test.iFld += i2;
        Test.iArrFld[(i1 >>> 1) % N] = 187;
        Test.bFld = Test.bFld;
        switch (((i2 >>> 1) % 9) + 121) {
        case 121:
            Test.iFld *= Test.sFld;
            break;
        case 122:
            for (i10 = 9; 151 > i10; i10++) {
                Test.iArrFld[i10] -= (int)d;
                Test.instanceCount = Test.instanceCount;
            }
            break;
        case 123:
            lArr1[(146 >>> 1) % N] = i10;
            break;
        case 124:
            Test.instanceCount *= 6;
            break;
        case 125:
            Test.instanceCount >>>= i11;
            break;
        case 126:
            i1 %= (int)(i10 | 1);
            break;
        case 127:
            i1 >>= i2;
        case 128:
            i1 = (int)Test.instanceCount;
            break;
        case 129:
            Test.iFld += (int)d;
        default:
            Test.bFld = Test.bFld;
        }
        vMeth_check_sum += i1 + Double.doubleToLongBits(d) + by + Float.floatToIntBits(f) + i2 + i10 + i11 +
            FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=46675, i12=-2, i13=-96, i14=27776, i15=96, i16=-80;
        float f5=-39.827F;
        byte by3=85;
        long lArr2[][]=new long[N][N];

        FuzzerUtils.init(lArr2, -2L);

        fArrFld[(i >>> 1) % N] += i;
        vMeth(i, dFld);
        fArrFld[(Test.iFld >>> 1) % N] = i;
        i12 = 1;
        while (++i12 < 340) {
            for (f5 = i12; f5 < 74; ++f5) {
                for (i14 = 1; i14 < 1; ++i14) {
                    lArr2[i14 + 1][(int)(f5)] -= 38097;
                    dFld += i15;
                    Test.iArrFld[(Test.iFld >>> 1) % N] *= i14;
                    i13 += (-22348 + (i14 * i14));
                    i += (((i14 * Test.iFld) + f5) - i);
                }
                Test.iArrFld[(int)(f5 - 1)] += i15;
                i = i15;
                Test.instanceCount += (long)(f5 * f5);
                i15 += i;
                by3 |= (byte)i15;
                i16 = 1;
                do {
                    by3 += (byte)dFld;
                    i13 -= 1;
                    Test.iFld += (((i16 * Test.iFld) + i12) - i16);
                    dFld -= Test.instanceCount;
                    Test.iArrFld[(int)(f5 - 1)] >>>= i15;
                    if (Test.bFld) continue;
                    i15 = (int)Test.instanceCount;
                    if (Test.bFld) {
                        i &= (int)Test.instanceCount;
                        Test.iArrFld = Test.iArrFld;
                        i15 ^= (int)Test.instanceCount;
                        i13 = -74;
                    } else {
                        by3 -= (byte)i13;
                    }
                } while (++i16 < 1);
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