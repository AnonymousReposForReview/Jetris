package tests.javafuzzer707;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:14:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-249L;
    public static boolean bFld=false;
    public static float fFld=19.273F;
    public static volatile byte byFld=-72;
    public short sFld=12664;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 13);
        FuzzerUtils.init(Test.fArrFld, 2.710F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(boolean b1, double d, int i6) {

        short s=23281;
        int i7=50285, i8=53802, i9=-1, i10=-8517, i11=-196, i12=-4;
        float f1=126.463F;

        s += (short)i6;
        i7 = 1;
        do {
            i8 = 1;
            while (++i8 < 9) {
                i6 -= i8;
                Test.instanceCount += (((i8 * i6) + i7) - i6);
                Test.instanceCount = i6;
                Test.instanceCount += (((i8 * f1) + Test.instanceCount) - i6);
            }
            if (i7 != 0) {
            }
            i6 /= (int)((long)(f1) | 1);
            for (i9 = 1; i9 < 9; i9++) {
                switch ((i7 % 2) + 4) {
                case 4:
                    i10 |= i8;
                    for (i11 = 1; 2 > i11; ++i11) {
                        f1 = i8;
                        i6 -= (int)69.574F;
                    }
                    break;
                case 5:
                    i12 = i6;
                default:
                    f1 *= i8;
                }
            }
        } while (++i7 < 175);
        long meth_res = (b1 ? 1 : 0) + Double.doubleToLongBits(d) + i6 + s + i7 + i8 + Float.floatToIntBits(f1) + i9 +
            i10 + i11 + i12;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1() {

        int i5=185;
        double d1=0.127747;
        short s1=31693;

        i5 %= (int)((((i5 + i5) - Integer.reverseBytes(i5)) + ((i5 * i5) + lMeth(Test.bFld, d1, i5))) | 1);
        i5 -= s1;
        i5 += (int)Test.instanceCount;
        vMeth1_check_sum += i5 + Double.doubleToLongBits(d1) + s1;
    }

    public static void vMeth(int i3, int i4) {

        boolean b=false;
        int i13=-45843, i14=152, i15=-3, i16=-11829, i17=-8, i18=-123, i19=52255;
        double d2=2.115434;

        b = b;
        vMeth1();
        for (i13 = 14; i13 < 373; ++i13) {
            for (i15 = 5; i15 > 1; --i15) {
                i4 = i16;
                Test.iArrFld[i13 + 1] = (int)Test.instanceCount;
                if (true) continue;
                i17 = 1;
                do {
                    Test.instanceCount = i13;
                } while (++i17 < 2);
                for (i18 = 1; i18 < 2; ++i18) {
                    i16 >>= i18;
                    i19 = (int)Test.fFld;
                    i4 += i4;
                    Test.byFld += (byte)(i18 ^ Test.instanceCount);
                    d2 = Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += i3 + i4 + (b ? 1 : 0) + i13 + i14 + i15 + i16 + i17 + i18 + i19 +
            Double.doubleToLongBits(d2);
    }

    public void mainTest(String[] strArr1) {

        int i=-10, i1=189, i2=81, i20=99, i21=7, i22=0, i23=-89;
        float f=-2.547F;
        double d3=0.90123;

        i -= (int)(2.225F % ((long)(f) | 1));
        for (i1 = 6; i1 < 137; ++i1) {
            f += i2;
            if (true) break;
            vMeth(i1, i1);
            d3 += sFld;
            for (i20 = 7; i20 < 191; ++i20) {
                for (i22 = i20; i22 < 2; ++i22) {
                    Test.fArrFld[i22] = Test.instanceCount;
                    i21 = (int)Test.instanceCount;
                    i += i22;
                    switch ((i1 % 3) + 63) {
                    case 63:
                        sFld = (short)Test.instanceCount;
                        Test.instanceCount = i21;
                        d3 += sFld;
                        i2 = i21;
                    case 64:
                        switch ((i20 % 9) + 107) {
                        case 107:
                            i2 = i22;
                            break;
                        case 108:
                            i23 /= (int)(i2 | 1);
                            sFld -= (short)Test.instanceCount;
                            break;
                        case 109:
                            i21 = (int)f;
                            break;
                        case 110:
                        case 111:
                            i23 = i2;
                            Test.bFld = Test.bFld;
                            Test.instanceCount += i22;
                            i23 >>= i20;
                            break;
                        case 112:
                            Test.instanceCount = i20;
                            i21 = Test.byFld;
                            break;
                        case 113:
                            i += (i22 - i22);
                            i23 = -9;
                            break;
                        case 114:
                            Test.instanceCount += (i22 - i);
                        case 115:
                            i21 = (int)f;
                        default:
                            i2 = (int)Test.instanceCount;
                        }
                        break;
                    case 65:
                    }
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
