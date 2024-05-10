package tests.javafuzzer1523;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 22:05:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-40L;
    public float fFld=-37.238F;
    public static double dFld=95.54204;
    public static float fFld1=-14.428F;
    public static boolean bFld=true;
    public static int iFld=-1;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[][]=new double[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 4212);
        FuzzerUtils.init(Test.dArrFld, 1.93606);
    }

    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(long l1) {

        int i7=166, i8=4, i9=10, i10=177, i11=-53106, i12=-1, i13=45786, iArr2[]=new int[N];
        byte by1=124;
        double d=-2.83046;
        float fArr[]=new float[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr2, -9);
        FuzzerUtils.init(fArr, 0.539F);
        FuzzerUtils.init(bArr, true);

        i7 /= (int)((long)(Test.dFld) | 1);
        Test.iArrFld[(40 >>> 1) % N] += i7;
        for (i8 = 13; 286 > i8; ++i8) {
            i7 |= 38292;
            iArr2[i8 + 1] -= i8;
            Test.iArrFld[i8 + 1] = (int)Test.instanceCount;
            for (i10 = 1; i10 < 6; ++i10) {
                i7 = i9;
                fArr[i8 - 1] += by1;
            }
            i7 = (int)d;
        }
        i9 = i8;
        i9 += i10;
        for (i12 = 1; i12 < 185; i12++) {
            boolean b=true;
            bArr[i12 + 1] = b;
        }
        i13 /= (int)(i9 | 1);
        long meth_res = l1 + i7 + i8 + i9 + i10 + i11 + by1 + Double.doubleToLongBits(d) + i12 + i13 +
            FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(bArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static short sMeth() {

        int i6=-65067, i14=10, i15=-39646, i16=-51180, i17=-22651, i18=14, iArr1[]=new int[N];
        byte by2=-57;

        FuzzerUtils.init(iArr1, 4491);

        i6 = 1;
        do {
            iArr1[i6] -= (int)(fMeth(Test.instanceCount) * 4176567734L);
            for (i14 = 1; i14 < 9; i14++) {
                for (i16 = i14; i16 < 2; ++i16) {
                    Test.fFld1 = Test.instanceCount;
                    i15 <<= i17;
                    by2 += (byte)(i16 | (long)Test.fFld1);
                    i17 += (i16 * i16);
                    i15 -= i6;
                    iArr1[i14 - 1] = (int)Test.instanceCount;
                    i15 <<= i15;
                    Test.dArrFld[i6 + 1][i16] = i16;
                }
                try {
                    i17 = (-5363 % i14);
                    i15 = (5642 / i18);
                    i15 = (i14 % 53282);
                } catch (ArithmeticException a_e) {}
                if (Test.bFld) continue;
                i18 += by2;
            }
        } while (++i6 < 171);
        long meth_res = i6 + i14 + i15 + i16 + i17 + by2 + i18 + FuzzerUtils.checkSum(iArr1);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void vMeth(long l, int i, byte by) {

        int i2=3, i3=33216, i4=76, i5=-44670, iArr[]=new int[N];
        short s=-22376;

        FuzzerUtils.init(iArr, 7);

        for (int i1 : iArr) {
            i = Math.abs(209);
            for (i2 = 1; i2 < 4; i2++) {
                Test.instanceCount = Math.max((int)((i3 - l) - (Test.instanceCount = Test.instanceCount)), (int)((2 +
                    (15029 & iArr[i2])) | (13356 - (Test.instanceCount - -19650L))));
                i += (int)((++Test.instanceCount) * (l = (131 + i1)));
                Test.instanceCount += (-34356 + (i2 * i2));
                i1 = iArr[i2];
                for (i4 = 2; i4 > 1; i4--) {
                    l = (s--);
                    Test.instanceCount = (long)(fFld++);
                    Test.instanceCount = (Math.max((int)(fFld + i5), ++i5) << i);
                    Test.instanceCount += (i4 * i4);
                }
                i3 >>>= -3;
            }
            i1 -= 4;
            l -= (long)(sMeth() + Test.dFld);
        }
        vMeth_check_sum += l + i + by + i2 + i3 + i4 + i5 + s + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i19=13, i20=-41076, i21=0, i22=-2, i23=9, i24=2, iArr3[]=new int[N];
        byte by3=94;
        short s1=22457;

        FuzzerUtils.init(iArr3, -4);

        vMeth(Test.instanceCount, i19, by3);
        Test.bFld = Test.bFld;
        for (i20 = 2; i20 < 122; ++i20) {
            for (i22 = i20; i22 < 209; i22++) {
                i19 += (((i22 * i23) + i19) - i21);
                Test.instanceCount *= i22;
                iArr3[i20] ^= i23;
            }
            i23 += (((i20 * s1) + Test.iFld) - Test.instanceCount);
            i24 = 1;
            do {
                iArr3[i24 + 1] >>= i19;
            } while (++i24 < 209);
            Test.iFld += i20;
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
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  fMeth ->  fMeth sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}