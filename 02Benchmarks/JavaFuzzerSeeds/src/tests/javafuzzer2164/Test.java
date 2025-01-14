package tests.javafuzzer2164;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:42:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-961249436L;
    public static float fFld=86.636F;
    public static boolean bFld=true;
    public double dFld=1.5105;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 21454);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(int i4) {

        int i5=-66, i6=55, i7=-116, i8=2867, i9=222, iArr1[]=new int[N];
        byte by=-24;

        FuzzerUtils.init(iArr1, 110);

        i4 -= (int)Test.instanceCount;
        for (i5 = 18; i5 < 316; i5++) {
            Test.fFld -= by;
            if (Test.bFld) continue;
        }
        i7 = 1;
        do {
            for (i8 = 1; i8 < 6; i8 += 2) {
                iArr1[i8] += by;
            }
            iArr1[i7 + 1] <<= i7;
            iArr1[i7 - 1] = i7;
            Test.instanceCount += i6;
            Test.instanceCount = Test.instanceCount;
            iArr1[i7 + 1] >>= i8;
            Test.fFld += (i7 + i4);
            i6 = (int)Test.fFld;
            i4 += 216;
        } while (++i7 < 279);
        long meth_res = i4 + i5 + i6 + by + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr1);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(short s) {

        int i2=0, i3=-188, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -10);

        for (i2 = 9; i2 < 149; ++i2) {
            iArr[i2 - 1] >>= iMeth2(i3);
        }
        Test.instanceCount = i2;
        Test.instanceCount += i3;
        long meth_res = s + i2 + i3 + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i1) {

        short s1=-3340;
        int i10=-77, i11=-40704, i12=-11, i13=5, i14=14, i15=-6, i16=-1;
        long l=209L, lArr[]=new long[N];
        float fArr[]=new float[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(fArr, -92.404F);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr, 3260380061L);

        fArr[(i1 >>> 1) % N] = (iMeth1(s1) * i1);
        if (Test.bFld) {
            for (i10 = 8; i10 < 218; i10++) {
                Test.fFld = i11;
                for (i12 = 8; i12 > 1; i12 -= 2) {
                    i13 = i11;
                    i11 = (int)l;
                    Test.instanceCount -= i11;
                    bArr[i12 - 1] = Test.bFld;
                    lArr[i10 + 1] = 14405;
                }
                for (i14 = 1; i14 < 8; i14++) {
                    i16 = 1;
                    do {
                        fArr[i16 + 1] = s1;
                        l -= i12;
                        Test.iArrFld[i16] *= i1;
                    } while (++i16 < 2);
                }
            }
        } else if (Test.bFld) {
            i15 *= i10;
        } else {
            i1 >>= i14;
        }
        long meth_res = i1 + s1 + i10 + i11 + i12 + i13 + l + i14 + i15 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(bArr) +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-60362, i18=109, i19=-11, i20=249, i21=-7005, i22=-44460, i23=-57499, i24=-36769, i25=-17026, i26=-180,
            i27=245, i28=-54568, i29=13174, i30=7, i31=-25746, i32=-49201, i33=22835;
        long l2=9L;
        short sArr[][]=new short[N][N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(sArr, (short)-2668);
        FuzzerUtils.init(fArr1, 0.494F);

        i = Math.abs(iMeth(i));
        for (int i17 : Test.iArrFld) {
            i18 = 1;
            while (++i18 < 63) {
                i /= 10;
            }
            for (i19 = 3; i19 < 63; ++i19) {
                i21 = 1;
                do {
                    dFld -= Test.instanceCount;
                } while (++i21 < 2);
                i20 = i18;
                for (i22 = 1; i22 < 2; i22++) {
                    i = i21;
                    Test.instanceCount += i22;
                }
            }
            for (i24 = 1; i24 < 63; ++i24) {
                Test.iArrFld = Test.iArrFld;
            }
            Test.instanceCount -= Test.instanceCount;
            for (i26 = 3; i26 < 63; i26++) {
                i20 = i26;
                i20 = 4;
            }
            Test.iArrFld[(i20 >>> 1) % N] *= (int)-113.299F;
        }
        sArr[(i18 >>> 1) % N][(i24 >>> 1) % N] *= (short)Test.instanceCount;
        i27 = (int)Test.instanceCount;
        Test.iArrFld[(-227 >>> 1) % N] = i21;
        for (i28 = 6; i28 < 186; i28++) {
            Test.instanceCount = i19;
            i20 += i29;
            for (i30 = 7; i30 < 139; i30++) {
                try {
                    i29 = (Test.iArrFld[i28] / i30);
                    i23 = (i24 % i26);
                    Test.iArrFld[i28] = (i21 % -140);
                } catch (ArithmeticException a_e) {}
                for (i32 = 1; i32 < 2; ++i32) {
                    fArr1[i32 - 1] += i31;
                    l2 += i31;
                    i31 += (int)Test.instanceCount;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
