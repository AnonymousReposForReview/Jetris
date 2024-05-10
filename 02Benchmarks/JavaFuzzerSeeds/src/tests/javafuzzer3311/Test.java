package tests.javafuzzer3311;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 05:46:46 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4118004440035087514L;
    public static double dFld=8.42672;
    public static byte byFld=-125;
    public boolean bFld=true;
    public static byte byArrFld[]=new byte[N];
    public static volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)26);
        FuzzerUtils.init(Test.fArrFld, 27.248F);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(int i4) {

        int i5=-34098, i6=-109, i7=0, i8=12, i9=32712, i10=45077, i11=14;
        float f1=-49.2F;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -4265215737L);

        for (i5 = 1; 334 > i5; i5++) {
            for (i7 = 1; i7 < 5; i7++) {
                i6 += i7;
                for (i9 = 1; i9 < 2; i9++) {
                    Test.instanceCount -= (long)Test.dFld;
                    i4 *= (int)Test.dFld;
                    switch ((i5 % 2) + 91) {
                    case 91:
                        f1 = i4;
                        break;
                    case 92:
                        i10 *= -3;
                        f1 *= Test.instanceCount;
                    default:
                        lArr = lArr;
                        lArr[i5 + 1][i5] >>= Test.instanceCount;
                        f1 += (i9 * i6);
                    }
                }
                Test.instanceCount -= -80;
                i11 += i7;
            }
        }
        long meth_res = i4 + i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + i11 + FuzzerUtils.checkSum(lArr);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth1() {

        float f=-2.903F, fArr1[]=new float[N];
        int i3=-4;

        FuzzerUtils.init(fArr1, -17.590F);

        f = (((Test.byArrFld[(i3 >>> 1) % N]++) * (fArr1[(-6 >>> 1) % N]--)) * Math.max((int)(f - i3), 7));
        i3 = iMeth2(-13);
        i3 >>= i3;
        long meth_res = Float.floatToIntBits(f) + i3 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(double d) {

        int i2=19, i12=-62, i13=12, i14=86, i15=-1279, i16=-9, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -152);

        i2 += (i2 + iMeth1());
        iArr[(i2 >>> 1) % N] -= (int)28143L;
        for (i12 = 8; i12 < 214; i12 += 3) {
            i2 = 168;
            iArr[i12 + 1] = (int)Test.instanceCount;
            iArr[i12] |= (int)Test.instanceCount;
            Test.instanceCount >>= i12;
            Test.fArrFld[i12 - 1] = i13;
            i13 = i2;
        }
        iArr[(i2 >>> 1) % N] %= (int)(Test.byFld | 1);
        for (i14 = 12; i14 < 273; i14++) {
            i15 = -49;
            i16 = 1;
            do {
                iArr[i16 - 1] += (int)-60035L;
                iArr = iArr;
            } while (++i16 < 6);
        }
        long meth_res = Double.doubleToLongBits(d) + i2 + i12 + i13 + i14 + i15 + i16 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-41607, i1=5;
        short s=10016;
        float fArr[]=new float[N];
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(fArr, 0.893F);
        FuzzerUtils.init(lArr1, 6L);

        for (i = 200; i > 3; --i) {
            fArr[i - 1] -= (-11 + iMeth(-37.103315));
            bFld = bFld;
        }
        i1 = i1;
        i1 *= (int)Test.instanceCount;
        s -= (short)i;
        lArr1[(i >>> 1) % N][(i >>> 1) % N] <<= i;

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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
