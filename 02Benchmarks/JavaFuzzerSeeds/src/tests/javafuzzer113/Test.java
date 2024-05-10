package tests.javafuzzer113;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 22:27:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4716954092589739854L;
    public static int iFld=12386;
    public static double dFld=0.37876;
    public static int iFld1=26783;
    public static byte byFld=-20;
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 15731);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(long l1) {

        int i9=44106, i10=160, i11=3, i12=250, i13=41092, i14=8, i15=22097, i16=-152, i17=-3, i18=-12, i19=-187,
            i20=-32655, iArr2[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -27416L);
        FuzzerUtils.init(iArr2, 18);

        for (i9 = 11; i9 < 299; i9++) {
            lArr[i9] -= Test.iFld;
        }
        i11 = 268;
        do {
            Test.dFld *= 1.999F;
            i12 = 1;
            while (++i12 < 6) {
                i10 -= i12;
                iArr2 = FuzzerUtils.int1array(N, (int)104);
            }
            for (i13 = 1; i13 < 6; ++i13) {
                Test.iFld1 |= i12;
            }
        } while (--i11 > 0);
        for (i15 = 184; i15 > 5; --i15) {
            for (i17 = 1; i17 < 9; i17++) {
                for (i19 = 1; i19 < 2; ++i19) {
                    iArr2[i15 + 1] <<= i15;
                    i20 >>= i19;
                    iArr2[i17 - 1] = i10;
                }
            }
        }
        long meth_res = l1 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + i19 + i20 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(int i8, long l) {

        int i21=-47382, i22=11, i23=35, i24=-4, i25=203, iArr3[]=new int[N];
        float f1=119.252F, fArr[]=new float[N];
        byte by=108;

        FuzzerUtils.init(fArr, 110.599F);
        FuzzerUtils.init(iArr3, 18755);

        Test.iFld = (int)((-(l--)) + (22113 - (-58241 - iMeth2(Test.instanceCount))));
        for (i21 = 8; i21 < 189; ++i21) {
            for (f1 = 9; i21 < f1; --f1) {
                Test.iFld >>= Test.iFld;
                for (i24 = (int)(f1); i24 < 1; i24++) {
                    short s=-31678;
                    fArr[i21 + 1] = 6L;
                    iArr3[i24 + 1] = (int)l;
                    i8 = (int)1051405033L;
                    s = (short)i22;
                    Test.iFld += i8;
                    i23 += (i24 * i24);
                    by += (byte)s;
                    Test.dFld = i25;
                }
                iArr3[i21] -= Test.iFld1;
                if (false) break;
            }
        }
        long meth_res = i8 + l + i21 + i22 + Float.floatToIntBits(f1) + i23 + i24 + i25 + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr3);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i4, int i5) {

        int i6=-45453, i7=-27033, i26=-8, iArr1[]=new int[N];
        float f=-24.723F;

        FuzzerUtils.init(iArr1, -16241);

        for (i6 = 10; i6 < 190; i6++) {
            f -= i6;
            i5 = (++Test.iFld);
            iArr1 = (iArr1 = iArr1);
            Test.iFld = iMeth1(Test.iFld, Test.instanceCount);
        }
        i26 = 1;
        while (++i26 < 384) {
            try {
                i4 = (i4 / 217);
                i7 = (Test.iFld1 % Test.iFld);
                i4 = (Test.iFld % 136);
            } catch (ArithmeticException a_e) {}
            if (true) continue;
            i5 += (int)-45L;
            switch (((i26 % 1) * 5) + 9) {
            case 11:
                iArr1[i26 - 1] += 36735;
                break;
            }
        }
        long meth_res = i4 + i5 + i6 + i7 + Float.floatToIntBits(f) + i26 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=206, i1=-2840, i2=30, i3=43, i27=62984, i28=51508, i29=-6, i30=9, i31=2, i32=-89, iArr[]=new int[N];
        double d=74.87272, d1=2.113811;
        short s1=-4267;
        byte byArr[]=new byte[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, -7);
        FuzzerUtils.init(byArr, (byte)47);
        FuzzerUtils.init(lArr1, -18001L);

        for (i = 5; 153 > i; i++) {
            i1 += (i * i);
            for (i2 = 169; 2 < i2; --i2) {
                d += (-98.388F + iArr[i + 1]);
                i1 *= (--i3);
            }
            i1 >>= (int)((-50L - (i3 - i3)) / ((i3 = (iArr[i - 1] -= i)) | 1));
            iArr[i] += (int)(((i * Test.instanceCount) % (Integer.reverseBytes(-2) | 1)) + iMeth(Test.iFld1, -5));
            s1 &= (short)-7L;
            Test.iFld1 -= i3;
            for (i27 = 2; i27 < 169; i27++) {
                Test.iFld1 += Test.iFld1;
                try {
                    i3 = (iArr[i27 - 1] / 147);
                    iArr[i - 1] = (i27 % i28);
                    i3 = (-172 % i1);
                } catch (ArithmeticException a_e) {}
                i29 = 2;
                do {
                    Test.instanceCount += Test.instanceCount;
                    iArr[i27 + 1] = 0;
                    Test.instanceCount = Test.iFld1;
                } while (--i29 > 0);
                Test.byFld = (byte)i1;
                for (i30 = 2; 1 < i30; i30--) {
                    Test.iArrFld = Test.iArrFld;
                    byArr[i + 1] += (byte)d;
                    i28 <<= i2;
                }
                i28 += i27;
                d1 = 2;
                while (--d1 > 0) {
                    iArr[(int)(d1 + 1)] -= i;
                    i32 = i;
                    lArr1[(int)(d1 - 1)] = -244;
                    Test.instanceCount += s1;
                    i32 <<= (int)Test.instanceCount;
                    i28 *= Test.iFld;
                    i1 >>= i30;
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
