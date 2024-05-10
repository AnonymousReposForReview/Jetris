package tests.javafuzzer819;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:22:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3827117812L;
    public static float fFld=-115.614F;
    public static volatile int iFld=41291;
    public static byte byFld=78;
    public static volatile int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 11083);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, long l1, int i4) {

        int i6=8, i7=9, i8=168, i9=31487, i10=-189, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 0);

        for (int i5 : iArr) {
            i4 = i4;
            i5 = (int)Test.instanceCount;
        }
        i6 = 1;
        while (++i6 < 246) {
            i4 = i6;
            for (i7 = 7; i7 > 1; i7 -= 2) {
                i4 |= (int)l1;
                i8 <<= i7;
                for (i9 = i7; i9 < 3; ++i9) {
                    switch (((i6 % 2) * 5) + 14) {
                    case 23:
                        Test.instanceCount >>= i10;
                        l = i10;
                        i4 = i7;
                        iArr[i9] = (int)l1;
                    case 18:
                        Test.fFld -= i9;
                        break;
                    }
                }
            }
        }
        vMeth2_check_sum += l + l1 + i4 + i6 + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i2, int i3) {

        int i11=0, i12=252, i13=20766, i14=8, i15=94, i16=-23, i17=218, iArr1[]=new int[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr1, 134);
        FuzzerUtils.init(fArr1, 0.62F);

        vMeth2(-239947092L, Test.instanceCount, i3);
        i2 += (int)Test.fFld;
        Test.instanceCount += i2;
        i2 = (int)Test.instanceCount;
        i3 -= i3;
        for (i11 = 5; 247 > i11; i11++) {
            for (i13 = i11; 7 > i13; i13 += 2) {
                for (i15 = i11; i15 < 1; i15++) {
                    i16 -= i3;
                    try {
                        i3 = (51619 / iArr1[i11]);
                        i14 = (i13 % -118247874);
                        iArr1[i15] = (i11 % i15);
                    } catch (ArithmeticException a_e) {}
                    i3 >>= i14;
                    i17 <<= -45308;
                    fArr1[i15 + 1] += i2;
                    Test.instanceCount += (i15 * i16);
                    Test.instanceCount = i3;
                }
            }
        }
        vMeth1_check_sum += i2 + i3 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static void vMeth(byte by) {

        double d=0.101665;
        int i1=-56423, i18=253, i19=-59969, i20=-45852, i21=-100, i22=17;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)74);

        Test.fFld *= (float)(((d + 152) * (Test.instanceCount - i1)) + Math.abs((int)(Test.instanceCount + -2.266F)));
        vMeth1(i1, i1);
        i1 -= (int)Test.instanceCount;
        i18 = 1;
        while (++i18 < 354) {
            for (i19 = 1; i19 < 5; i19++) {
                i20 *= Test.iFld;
                Test.iArrFld[i18][i18 - 1] = (int)Test.instanceCount;
                Test.fFld -= Test.instanceCount;
                i21 = 1;
                while (++i21 < 2) {
                    i22 += (i21 * i21);
                    Test.iFld += (int)Test.instanceCount;
                    i1 = i18;
                    i20 *= (int)Test.fFld;
                    byArr[i18] += (byte)24421;
                    d = Test.fFld;
                }
            }
        }
        vMeth_check_sum += by + Double.doubleToLongBits(d) + i1 + i18 + i19 + i20 + i21 + i22 +
            FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-12706, i23=239, i24=-38;
        short s=-32335;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -63.233F);

        for (float f : fArr) {
            i = 39297;
            try {
                i = (i / -255);
                i = (-64780 % i);
                i = (i % -215);
            } catch (ArithmeticException a_e) {}
        }
        vMeth((byte)(95));
        s -= (short)1.130F;
        Test.byFld -= (byte)12070;
        for (i23 = 2; i23 < 139; ++i23) {
            Test.fFld += i23;
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
