package tests.javafuzzer1028;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:55:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-47968L;
    public static float fFld=-121.533F;
    public static short sFld=1529;
    public static int iFld=192;
    public static double dArrFld[]=new double[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -1.80531);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f, float f1) {

        int i5=155, i6=-221, i7=106, i8=42212, i10=-41140, i11=7, i12=4, i13=-59690, iArr[]=new int[N];
        byte by=64;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -32099);
        FuzzerUtils.init(fArr, -1.734F);

        for (i5 = 17; i5 < 273; i5++) {
            for (i7 = i5; i7 < 6; ++i7) {
                Test.instanceCount += by;
            }
            switch (((i5 % 1) * 5) + 27) {
            case 28:
                fArr[i5] = i8;
                fArr[i5] += Test.instanceCount;
            default:
                for (i10 = 6; i10 > 1; i10--) {
                    i6 = 43778;
                    f = i6;
                    i12 = 1;
                    while (++i12 < 2) {
                        i11 >>= i7;
                        i11 *= by;
                        i6 = i12;
                        i13 *= (int)Test.instanceCount;
                        Test.instanceCount += (((i12 * i12) + f1) - i11);
                    }
                }
            }
        }
        vMeth2_check_sum += Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i5 + i6 + i7 + i8 + by + i10 + i11 +
            i12 + i13 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(int i3, long l2, int i4) {

        int i14=-13, i15=194, i16=-26605, i17=-93, i18=8, i19=-34875;
        long l3=-60L, l4=11L;
        boolean b=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-5);

        vMeth2(Test.fFld, Test.fFld);
        Test.sFld >>>= (short)146;
        for (i14 = 14; i14 < 394; i14 += 2) {
            i3 += i14;
            Test.sFld <<= (short)11816;
            l3 = 1;
            while (++l3 < 8) {
                double d=-49.23545;
                if (b) {
                    for (l4 = 1; 1 < l4; --l4) {
                        i15 += (int)(l4 + l3);
                        byArr[i14] *= (byte)l4;
                    }
                    d = i4;
                    i15 ^= i4;
                    for (i17 = 1; 1 > i17; i17++) {
                        if (b) continue;
                        Test.dArrFld[i14] -= i19;
                    }
                }
            }
        }
        vMeth1_check_sum += i3 + l2 + i4 + i14 + i15 + l3 + l4 + i16 + i17 + i18 + (b ? 1 : 0) + i19 +
            FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth(long l, long l1, int i2) {

        int i20=-210, i21=10526, i22=-59555, i23=21, iArr1[]=new int[N];
        float f2=-100.271F;
        double d1=-31.72727;
        boolean b1=false;
        byte by1=-116;

        FuzzerUtils.init(iArr1, 22586);

        vMeth1(i2, l, i2);
        for (i20 = 6; i20 < 393; i20++) {
            for (f2 = 1; 4 > f2; f2++) {
                Test.fFld -= Test.instanceCount;
                i22 -= (int)l1;
                i22 = 48682;
            }
            if (i21 != 0) {
                vMeth_check_sum += l + l1 + i2 + i20 + i21 + Float.floatToIntBits(f2) + i22 +
                    Double.doubleToLongBits(d1) + i23 + (b1 ? 1 : 0) + by1 + FuzzerUtils.checkSum(iArr1);
                return;
            }
        }
        iArr1[(i2 >>> 1) % N] -= (int)f2;
        i2 = (int)d1;
        i23 = 1;
        do {
            i2 += 113;
            if (b1) {
                if (b1) break;
                i21 -= (int)d1;
                i22 = by1;
            } else if (b1) {
                Test.instanceCount += 14137;
            } else if (true) {
                i22 += (((i23 * i21) + l1) - f2);
            }
        } while (++i23 < 392);
        vMeth_check_sum += l + l1 + i2 + i20 + i21 + Float.floatToIntBits(f2) + i22 + Double.doubleToLongBits(d1) + i23
            + (b1 ? 1 : 0) + by1 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-188, i1=-46, i24=6, i25=38976, i26=12, i27=-10, i28=-103;
        long l5=1653024884660250527L, l6=-44104L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2015483443754143936L);

        for (i = 3; 137 > i; ++i) {
            vMeth(Test.instanceCount, Test.instanceCount, i1);
            for (i24 = i; i24 < 187; i24++) {
                Test.instanceCount += (((i24 * i1) + Test.fFld) - Test.fFld);
                for (l5 = 1; 1 > l5; l5++) {
                    Test.fFld = -70L;
                    lArr[(int)(l5 + 1)] <<= Test.sFld;
                    i26 = (int)Test.instanceCount;
                    iArrFld[(int)(l5 - 1)] *= -2;
                    iArrFld[(int)(l5 + 1)] *= i25;
                    i1 -= (int)-62.6218;
                }
            }
            for (l6 = 5; 187 > l6; ++l6) {
                boolean b2=true;
                switch ((i % 2) + 82) {
                case 82:
                    if (b2) break;
                    i25 = i24;
                    i26 = (int)l5;
                    break;
                case 83:
                    Test.iFld = i26;
                    try {
                        i1 = (iArrFld[(int)(l6 + 1)] / iArrFld[i]);
                        i1 = (i28 % -414923201);
                        i27 = (i25 % -11105);
                    } catch (ArithmeticException a_e) {}
                    i25 = i25;
                    Test.fFld += i1;
                    break;
                }
                if (b2) break;
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
