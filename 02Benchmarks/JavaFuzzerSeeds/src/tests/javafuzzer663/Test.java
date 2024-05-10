package tests.javafuzzer663;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 07:32:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-12L;
    public static int iFld=7;
    public static float fFld=-1.412F;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 221);
        FuzzerUtils.init(Test.dArrFld, -2.47482);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i8) {

        int i9=58, i10=7, i11=38101, i12=123;
        float f=1.539F, f1=2.349F;
        short s1=-20182;
        long lArr[]=new long[N];
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(lArr, -5L);
        FuzzerUtils.init(dArr, 1.35664);

        i8 -= i8;
        for (long l1 : lArr) {
            for (i9 = 1; 4 > i9; ++i9) {
                lArr[i9 + 1] -= (long)f;
                i10 = i8;
            }
            i11 = 1;
            do {
                Test.iFld -= i10;
                i10 = (int)Test.instanceCount;
                for (f1 = i11; f1 < 1; ++f1) {
                    i8 = (int)Test.instanceCount;
                }
                i8 -= i11;
                s1 = (short)i11;
                dArr[i11 + 1][i11] += -30514;
                Test.iArrFld = Test.iArrFld;
            } while (++i11 < 4);
            f += 6;
        }
        vMeth1_check_sum += i8 + i9 + i10 + Float.floatToIntBits(f) + i11 + Float.floatToIntBits(f1) + i12 + s1 +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static long lMeth(int i5, int i6, int i7) {

        int i13=-12, i14=163, i15=7, i16=-12527;
        boolean b=false;
        double d=2.84835;
        short s2=18288;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 38895L);

        i7 = (int)Test.instanceCount;
        vMeth1(i6);
        for (i13 = 10; i13 < 198; ++i13) {
            i15 = 1;
            do {
                if (b) break;
                d += -1.448F;
                i16 = 1;
                while (++i16 < 1) {
                    if (i5 != 0) {
                    }
                    i7 = (int)41456L;
                    Test.iFld += i5;
                    s2 *= (short)-3;
                    lArr1[i15 + 1] >>= -11;
                    b = b;
                    i5 *= (int)Test.instanceCount;
                    i7 &= (int)Test.instanceCount;
                }
            } while (++i15 < 8);
        }
        long meth_res = i5 + i6 + i7 + i13 + i14 + i15 + (b ? 1 : 0) + Double.doubleToLongBits(d) + i16 + s2 +
            FuzzerUtils.checkSum(lArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l) {

        int i1=160, i2=25997, i3=-47322, i4=45079, i17=13;
        short s=-5043;
        double d1=-1.47858;
        boolean b1=true;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, 878667545L);

        i1 -= (int)Test.instanceCount;
        i2 = s;
        i1 = (int)(((-87 * i2) + (i1 + i1)) + (l -= Long.reverseBytes(l)));
        for (i3 = 2; i3 < 165; i3++) {
            if ((i3 * (s += (short)lMeth(i4, i4, Test.iFld))) == i4) continue;
            Test.instanceCount >>= i2;
            Test.iFld = (int)d1;
        }
        switch (((218 >>> 1) % 2) + 19) {
        case 19:
            if (false) {
                i1 = i2;
                i17 += i3;
                i2 = (int)l;
            } else if (b1) {
                Test.iArrFld[(i4 >>> 1) % N] ^= 28324;
                i17 -= (int)d1;
                s -= (short)i3;
            }
            break;
        case 20:
            l *= -1641967131705587200L;
            break;
        }
        vMeth_check_sum += l + i1 + i2 + s + i3 + i4 + Double.doubleToLongBits(d1) + i17 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=-1, i18=6, i19=-22, i20=-9, i21=-120, i22=-2, i23=10, i24=-143, i25=22796, i26=97, i27=0, iArr[]=new
            int[N];
        byte by=-6;
        short s3=18286;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, 9);
        FuzzerUtils.init(fArr, -58.147F);

        i += iArr[(i >>> 1) % N];
        vMeth(Test.instanceCount);
        Test.iFld = 10;
        for (i18 = 3; i18 < 162; i18++) {
            i19 *= Test.iFld;
            i += i19;
            for (i20 = 5; i20 < 158; i20++) {
                for (i22 = 1; i22 < 2; ++i22) {
                    Test.dArrFld[i22] -= i19;
                    iArr[i22 - 1] = i20;
                    Test.instanceCount += Test.instanceCount;
                    i21 += (i22 * i22);
                    Test.dArrFld[i18 + 1] = Test.fFld;
                    Test.iFld += (int)Test.instanceCount;
                }
                for (i24 = 1; 2 > i24; i24++) {
                    Test.instanceCount = 21930;
                    by >>>= (byte)i23;
                    Test.iFld = (int)Test.instanceCount;
                    Test.instanceCount >>= i22;
                    iArr[(i24 >>> 1) % N] = Test.iFld;
                    iArr[i20] = i19;
                }
                fArr[i20 - 1] += Test.instanceCount;
                for (i26 = 1; i26 < 2; i26 += 2) {
                    i25 >>= by;
                    s3 >>= (short)Test.iFld;
                    Test.fFld -= Test.instanceCount;
                    i27 <<= (int)Test.instanceCount;
                    Test.instanceCount += i21;
                    i25 *= i;
                    i = (int)Test.instanceCount;
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}