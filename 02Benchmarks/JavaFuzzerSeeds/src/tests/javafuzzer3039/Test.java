package tests.javafuzzer3039;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:05:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=51339L;
    public static double dFld=2.69486;
    public static float fFld=-1.581F;
    public short sFld=-3171;
    public static int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 22142);
        FuzzerUtils.init(Test.iArrFld1, -15896);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i3=11, i4=124, i5=-29, i6=41, iArr[]=new int[N];
        float f1=0.72F;
        boolean b=true;

        FuzzerUtils.init(iArr, 4339);

        for (i3 = 6; 125 > i3; i3++) {
            i4 = i4;
            i4 = (int)Test.instanceCount;
            f1 = 1;
            do {
                float f2=1.329F;
                switch (((i3 % 2) * 5) + 58) {
                case 61:
                    i4 |= i4;
                    i4 += (int)(f1 + i3);
                    Test.dFld -= -6L;
                    Test.dFld -= i4;
                    break;
                case 62:
                    b = b;
                    for (i5 = 1; i5 < 1; i5 += 3) {
                        if (b) continue;
                        iArr[i5] += i4;
                    }
                    Test.instanceCount += (-51062 + (f1 * f1));
                    f2 += f1;
                    break;
                }
            } while (++f1 < 13);
        }
        vMeth2_check_sum += i3 + i4 + Float.floatToIntBits(f1) + (b ? 1 : 0) + i5 + i6 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(long l1, float f, long l2) {

        int i2=9, i7=2, i8=65514, i9=-174, iArr1[]=new int[N];
        byte by=43;
        long l3=253L;
        double d=0.121317;
        boolean b1=true;

        FuzzerUtils.init(iArr1, 51);

        i2 -= (int)(((by - l2) + (i2 ^ by)) + (l3 - (i2 - f)));
        switch (((((int)(-17 * (f -= (float)d))) >>> 1) % 1) + 25) {
        case 25:
            i2 = (int)Test.instanceCount;
            vMeth2();
            i2 >>= i2;
            by /= (byte)-11.223F;
        default:
            b1 = b1;
            switch ((((i2 >>> 1) % 1) * 5) + 39) {
            case 42:
                if (b1) {
                    for (i7 = 8; i7 < 290; ++i7) {
                        if (i7 != 0) {
                            vMeth1_check_sum += l1 + Float.floatToIntBits(f) + l2 + i2 + by + l3 +
                                Double.doubleToLongBits(d) + (b1 ? 1 : 0) + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr1);
                            return;
                        }
                        i9 &= i7;
                        iArr1 = iArr1;
                        i2 *= (int)l1;
                    }
                    f = i8;
                } else {
                    Test.dFld -= i8;
                }
                break;
            default:
                b1 = b1;
            }
        }
        vMeth1_check_sum += l1 + Float.floatToIntBits(f) + l2 + i2 + by + l3 + Double.doubleToLongBits(d) + (b1 ? 1 :
            0) + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(long l) {

        int i=4, i1=-60, i10=-13, i12=-5, i13=165, i14=-136, i15=-5;
        float f3=0.395F;
        short s=-30265;
        boolean b2=false;

        for (i = 11; i < 255; i++) {
            vMeth1(Test.instanceCount, f3, l);
            s &= (short)i1;
            Test.iArrFld[i - 1] = (int)l;
        }
        i10 = 1;
        do {
            if (b2) break;
            if (i != 0) {
                vMeth_check_sum += l + i + i1 + Float.floatToIntBits(f3) + s + i10 + (b2 ? 1 : 0) + i12 + i13 + i14 +
                    i15;
                return;
            }
            i1 += (i10 * i10);
        } while (++i10 < 181);
        i1 *= i1;
        for (int i11 : Test.iArrFld) {
            for (i12 = 1; i12 < 4; ++i12) {
                i13 &= i;
                for (i14 = 1; i14 < 2; i14++) {
                    Test.dFld *= -1966709303L;
                }
                f3 += (i12 * i12);
            }
        }
        vMeth_check_sum += l + i + i1 + Float.floatToIntBits(f3) + s + i10 + (b2 ? 1 : 0) + i12 + i13 + i14 + i15;
    }

    public void mainTest(String[] strArr1) {

        int i16=-171, i17=55149, i18=-12946, i19=-8, i20=0, i21=-61292, i22=7, i23=3684, i24=-13, i25=-54885, i26=-25;
        boolean b3=false;

        vMeth(Test.instanceCount);
        Test.fFld *= i16;
        for (i17 = 5; i17 < 148; i17++) {
            i18 <<= i16;
            i16 >>= 47;
            Test.iArrFld[i17] &= (int)Test.instanceCount;
            if (false) {
                i16 = i18;
                for (i19 = 8; i19 < 175; i19++) {
                    Test.fFld -= i16;
                    i18 = i16;
                    for (i21 = 1; 2 > i21; ++i21) {
                        Test.instanceCount |= i19;
                        Test.fFld -= i22;
                        i16 += (((i21 * Test.fFld) + Test.fFld) - i18);
                        Test.iArrFld[i17] = i17;
                    }
                    i22 += (int)Test.instanceCount;
                    for (i23 = 1; 2 > i23; ++i23) {
                        i16 = i16;
                        i24 += (int)Test.instanceCount;
                        sFld -= (short)i22;
                        Test.instanceCount += (i23 | i20);
                    }
                    Test.iArrFld1[i19] *= i17;
                }
                for (i25 = 5; i25 < 175; ++i25) {
                    i16 += (i25 * i25);
                    i18 += 14871;
                    b3 = false;
                }
                i18 -= -125;
            } else if (true) {
                Test.instanceCount += Test.instanceCount;
                Test.iArrFld1[i17 + 1] = i19;
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
