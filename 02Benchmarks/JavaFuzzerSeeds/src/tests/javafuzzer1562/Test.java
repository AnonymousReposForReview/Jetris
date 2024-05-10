package tests.javafuzzer1562;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 22:57:34 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-2799014744L;
    public int iFld=32272;
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 36593);
        FuzzerUtils.init(Test.lArrFld, 7L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        float f2=120.398F;

        f2 *= Test.instanceCount;
        vMeth1_check_sum += Float.floatToIntBits(f2);
    }

    public static int iMeth(int i6, byte by1, long l) {

        double d=102.39474;
        int i7=-11348, i8=-151, i9=13786;
        boolean b=false, bArr[]=new boolean[N];
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr, -4L);

        vMeth1();
        d *= d;
        for (i7 = 8; i7 < 200; i7++) {
            Test.iArrFld[i7] *= 57;
            by1 -= (byte)i8;
            i6 = (int)1.517F;
            i8 += i7;
            bArr[i7 + 1] = b;
            switch ((i7 % 2) + 3) {
            case 3:
                i9 = 1;
                do {
                    i6 += (i9 - by1);
                    lArr = lArr;
                    Test.iArrFld[i9] -= i6;
                    d = by1;
                    l *= i8;
                } while (++i9 < 8);
                break;
            case 4:
                i8 |= i6;
            default:
                i6 <<= i9;
            }
        }
        long meth_res = i6 + by1 + l + Double.doubleToLongBits(d) + i7 + i8 + (b ? 1 : 0) + i9 +
            FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        int i1=-46577, i2=78, i3=-5, i4=65, i5=43, i10=5, i11=-19348;
        float f=-48.697F;
        byte by=69;

        for (i1 = 287; 15 < i1; i1--) {
            for (i3 = 1; i3 < 6; ++i3) {
                i2 = (int)(Test.instanceCount = (--Test.instanceCount));
                for (f = 1; f < 2; ++f) {
                    float f1=8.556F;
                    f1 = (Test.iArrFld[(int)(f)] * -23033);
                    by += (byte)((i1 * (f1 - i4)) * ((++i5) * iMeth(i1, by, Test.instanceCount)));
                    i5 >>= (int)Test.instanceCount;
                    Test.iArrFld[(int)(f + 1)] += i4;
                    i4 /= (int)(Test.instanceCount | 1);
                    i2 = i4;
                }
                i5 <<= (int)1967104270L;
                for (i10 = 1; i10 < 2; ++i10) {
                    i11 = -13927;
                }
                i2 += i3;
                i5 >>= i1;
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + Float.floatToIntBits(f) + i5 + by + i10 + i11;
    }

    public void mainTest(String[] strArr1) {

        int i12=6741, i13=7, i14=2, i15=-143, i16=11, i17=-63;
        byte by2=-113;
        float f3=-89.394F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.70915);

        vMeth(iFld);
        iFld = iFld;
        i12 = 1;
        while (++i12 < 177) {
            for (i13 = 5; 142 > i13; i13++) {
                iFld = (int)Test.instanceCount;
                for (i15 = 1; 2 > i15; ++i15) {
                    boolean b1=true;
                    if (b1) {
                        dArr[i15 + 1] -= i13;
                        i14 *= (int)224L;
                        iFld += (i15 + iFld);
                        by2 += (byte)i12;
                    } else {
                        if (false) {
                            Test.iArrFld = FuzzerUtils.int1array(N, (int)3);
                        } else if (b1) {
                            Test.lArrFld[i13] >>= i15;
                            Test.instanceCount >>>= i12;
                            Test.lArrFld[i12] -= (long)f3;
                            Test.iArrFld[i12] = i16;
                        } else {
                            Test.iArrFld[i12] = i14;
                        }
                        i16 = (int)Test.instanceCount;
                    }
                    i16 |= i14;
                    i16 += (int)f3;
                    Test.instanceCount -= i15;
                    i14 += (i15 * i15);
                    Test.instanceCount += Test.instanceCount;
                    iFld = -61;
                    if (b1) break;
                }
                i17 = 1;
                while (++i17 < 2) {
                    Test.iArrFld[i13 + 1] -= i16;
                }
                iFld *= (int)Test.instanceCount;
                Test.instanceCount = i12;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
