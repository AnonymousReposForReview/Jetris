package tests.javafuzzer1119;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:43:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3922472953L;
    public static float fFld=1.462F;
    public static int iFld=-19455;
    public static volatile byte byFld=-105;
    public short sFld=-8408;
    public static volatile long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -4L);
        FuzzerUtils.init(Test.fArrFld, 0.555F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i4, int i5, short s1) {

        int i6=90, i7=68, i8=42230, i9=62404, i10=-82, i11=9, iArr2[]=new int[N];
        boolean b1=true;

        FuzzerUtils.init(iArr2, -23148);

        Test.instanceCount -= i5;
        Test.iFld /= (int)(i4 | 1);
        iArr2 = iArr2;
        Test.iFld -= (int)Test.instanceCount;
        for (i6 = 10; i6 < 172; ++i6) {
            Test.lArrFld[i6 + 1] >>>= s1;
            for (i8 = 10; 1 < i8; i8 -= 2) {
                Test.instanceCount = i9;
                Test.fFld += (i8 * i8);
                iArr2[i6 + 1] = (int)Test.instanceCount;
                if (b1) break;
            }
            for (i10 = 1; i10 < 10; ++i10) {
                if (b1) continue;
                i11 *= i6;
                i9 += (int)Test.instanceCount;
            }
        }
        long meth_res = i4 + i5 + s1 + i6 + i7 + i8 + i9 + (b1 ? 1 : 0) + i10 + i11 + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i3, short s) {

        int i12=-50875, i13=158, i14=104, i15=9, i16=62362, i17=44010, iArr3[][]=new int[N][N];
        boolean b2=true;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr3, -9);
        FuzzerUtils.init(fArr, -87.788F);

        i3 += (++i3);
        s += (short)Test.instanceCount;
        i3 = Integer.reverseBytes(iMeth(i3, Test.iFld, s));
        for (i12 = 7; i12 < 245; ++i12) {
            iArr3[i12 + 1] = FuzzerUtils.int1array(N, (int)250);
            for (i14 = 1; 7 > i14; i14++) {
                fArr[i14] += i14;
                b2 = b2;
                i13 = (int)-15L;
                for (i16 = i12; i16 < 2; i16++) {
                    Test.instanceCount -= 62L;
                    Test.instanceCount <<= Test.instanceCount;
                    Test.instanceCount += (-37674 + (i16 * i16));
                    Test.fFld *= i12;
                    try {
                        i13 = (i15 % iArr3[(i16 >>> 1) % N][i16 - 1]);
                        iArr3[i16 + 1][i16] = (i15 % 157);
                        iArr3[i12 - 1][i14 + 1] = (i3 / i3);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        vMeth1_check_sum += i3 + s + i12 + i13 + i14 + i15 + (b2 ? 1 : 0) + i16 + i17 + FuzzerUtils.checkSum(iArr3) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(boolean b, int i1) {

        int i2=6, i18=-26805, i19=158, i20=-33711, i21=-103, i22=56474, iArr1[]=new int[N];
        short s2=28590;

        FuzzerUtils.init(iArr1, 6);

        iArr1[(i1 >>> 1) % N] *= (int)Test.fFld;
        iArr1[(i1 >>> 1) % N] >>>= (int)((26641L - Math.abs(Test.fFld)) + i2);
        vMeth1(i1, (short)(10908));
        for (i18 = 9; i18 < 362; ++i18) {
            i20 = 1;
            do {
                for (i21 = 1; i21 < 1; i21++) {
                    s2 = (short)-2.850F;
                    i2 = i22;
                    Test.fFld += Test.instanceCount;
                    iArr1[i20] = (int)Test.fFld;
                    i19 = i20;
                    Test.instanceCount <<= Test.instanceCount;
                    Test.iFld = 34;
                    iArr1[i21] -= (int)-2474485582L;
                    i19 += (i21 * Test.instanceCount);
                }
            } while (++i20 < 5);
        }
        vMeth_check_sum += (b ? 1 : 0) + i1 + i2 + i18 + i19 + i20 + i21 + i22 + s2 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=52, i23=-18557, i24=-13, i25=-2, i26=-155, i27=118, i28=-5, iArr[]=new int[N];
        boolean b3=false;

        FuzzerUtils.init(iArr, -15802);

        i = 392;
        do {
            iArr = (iArr = iArr);
            vMeth(false, Test.iFld);
            Test.instanceCount -= 237;
            Test.iFld <<= Test.iFld;
            for (i23 = i; i23 < 64; ++i23) {
                Test.iFld = i23;
                i24 = Test.iFld;
                i24 -= i23;
                Test.fFld *= 65035;
                if (b3) break;
            }
            Test.fFld += i;
            for (i25 = 1; i25 < 64; ++i25) {
                double d=62.113100;
                Test.fArrFld[i25] *= i24;
                Test.fFld = i25;
                Test.byFld = (byte)-54;
                i26 += (i25 + i23);
                i26 <<= i24;
                Test.fFld += ((long)i25 ^ (long)Test.instanceCount);
                switch ((i25 % 3) + 122) {
                case 122:
                    sFld ^= (short)Test.instanceCount;
                    Test.iFld = i24;
                    break;
                case 123:
                    for (i27 = 2; i27 > 1; i27--) {
                        i24 *= i23;
                    }
                    i26 >>= i28;
                    sFld = (short)d;
                    break;
                case 124:
                    Test.iFld ^= Test.iFld;
                    Test.instanceCount += i25;
                    Test.byFld = (byte)Test.iFld;
                    break;
                }
                i26 = (int)27955L;
            }
        } while (--i > 0);



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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}