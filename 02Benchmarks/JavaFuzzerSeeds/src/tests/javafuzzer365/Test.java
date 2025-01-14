package tests.javafuzzer365;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 02:50:41 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-24659L;
    public static double dFld=-79.72793;
    public static float fFld=2.184F;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 64518);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static boolean bMeth(int i8) {

        int i9=6, i10=-7, i11=-8, i12=-59377;
        double dArr1[]=new double[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(dArr1, 2.83859);
        FuzzerUtils.init(lArr1, -13L);

        for (double d : dArr1) {
            Test.instanceCount *= i8;
            for (i9 = 4; i9 > 1; --i9) {
                Test.instanceCount -= i8;
                Test.instanceCount = i8;
                lArr1[i9 - 1] = i10;
                i10 -= i8;
                Test.fFld *= i8;
                i8 <<= -17549;
                Test.instanceCount += (i9 * i9);
                Test.instanceCount += 2909588798692449123L;
                for (i11 = 1; i11 < 2; i11++) {
                    Test.iArrFld[i9] -= i10;
                }
            }
            i12 -= 67;
            d = i10;
        }
        long meth_res = i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) +
            FuzzerUtils.checkSum(lArr1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static long lMeth() {

        long l=-195L, l1=-9L, lArr2[]=new long[N];
        int i7=-24, i13=23283, i14=-6, i15=15011, i16=14, i17=6;
        byte by=94;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 11.185F);
        FuzzerUtils.init(lArr2, 33448L);

        if (bMeth(-36681)) {
            for (l = 2; l < 307; l += 2) {
                Test.instanceCount += l;
            }
        } else {
            for (i13 = 16; 273 > i13; ++i13) {
                Test.instanceCount <<= i14;
                for (l1 = 6; 1 < l1; l1 -= 3) {
                    i7 = (int)l1;
                    fArr[i13 - 1] += by;
                    Test.fFld = Test.fFld;
                    i14 >>>= i13;
                    i14 += (-12 + (l1 * l1));
                    for (i16 = 1; i16 < 6; i16++) {
                        lArr2[i13] += i14;
                        Test.dFld -= i17;
                        i14 = (int)Test.fFld;
                    }
                }
            }
        }
        long meth_res = l + i7 + i13 + i14 + l1 + i15 + by + i16 + i17 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i5, int i6) {

        float f1=-98.783F;
        byte by1=-24, byArr[][]=new byte[N][N];
        int i18=-11, i19=34918, i20=202, i21=-61, i22=-171, i23=11619;
        boolean b=true, bArr[]=new boolean[N];
        short s=7809;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -2.113667);
        FuzzerUtils.init(byArr, (byte)-59);
        FuzzerUtils.init(bArr, false);

        i6 = (int)(((f1 + -8) + (dArr[(i6 >>> 1) % N]--)) - (i6 * byArr[(i6 >>> 1) % N][(i5 >>> 1) % N]));
        i5 >>= (int)((lMeth() - i6) ^ by1);
        for (i18 = 2; i18 < 207; i18++) {
            for (i20 = 1; i20 < 8; ++i20) {
                bArr[i20 - 1] = b;
                i6 += (i20 * i20);
                i19 = i20;
                for (i22 = 1; i22 < 2; i22++) {
                    Test.dFld += s;
                    Test.iArrFld[i22 + 1] >>= i20;
                    i23 += (((i22 * i18) + i6) - f1);
                    f1 = f1;
                    f1 -= f1;
                    i23 *= i6;
                    i6 = (int)Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += i5 + i6 + Float.floatToIntBits(f1) + by1 + i18 + i19 + i20 + i21 + (b ? 1 : 0) + i22 + i23 +
            s + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(byArr) +
            FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i=7, i1=-4, i2=-17991, i3=-1, i4=1, i24=-111;
        float f=27.19F;
        short s1=7917;
        long lArr[]=new long[N];
        byte byArr1[]=new byte[N];

        FuzzerUtils.init(lArr, 472873171L);
        FuzzerUtils.init(byArr1, (byte)0);

        i = 1;
        while (++i < 314) {
            i1 -= (int)lArr[i + 1];
            i2 = 1;
            while (++i2 < 80) {
                i1 += (((i2 * Test.instanceCount) + i) - f);
                for (i3 = 1; 1 > i3; i3++) {
                    switch ((((((int)(i1 + Test.dFld)) >>> 1) % 3) * 5) + 79) {
                    case 81:
                        f -= (i4++);
                        vMeth(-4, i);
                        i1 = -49689;
                        Test.instanceCount += (13 + (i3 * i3));
                        break;
                    case 83:
                        Test.iArrFld[i3] <<= i2;
                        i4 += i3;
                    case 80:
                    }
                    i1 >>= i3;
                    Test.instanceCount >>>= i;
                    i1 += i3;
                    Test.instanceCount = Test.instanceCount;
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)62228);
                    Test.instanceCount *= i;
                    if (false) continue;
                    i4 = (int)Test.instanceCount;
                    i1 += (int)Test.dFld;
                }
                lArr[i] = i4;
                i24 = 1;
                while (++i24 < 1) {
                    i4 >>= (int)Test.instanceCount;
                    Test.iArrFld[i2 - 1] -= i3;
                    i4 += i24;
                    Test.iArrFld[i24 + 1] += (int)Test.dFld;
                    Test.fFld -= Test.instanceCount;
                }
            }
            s1 += (short)(i * i24);
            byArr1[i] = (byte)i;
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
//DEBUG  bMeth ->  bMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
