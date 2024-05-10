package tests.javafuzzer366;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 02:50:42 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=932375942L;
    public static byte byFld=-47;
    public float fFld=2.8F;
    public double dFld=55.64568;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 172);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i8) {

        int i9=35222, i10=64023, i11=-24412, i12=61144, i13=-42819, iArr[]=new int[N];
        double d1=2.58532;
        float f1=12.237F;

        FuzzerUtils.init(iArr, -85);

        iArr[(41 >>> 1) % N] <<= 42606;
        Test.instanceCount -= -18722;
        for (i9 = 11; i9 < 198; i9++) {
            Test.instanceCount = Test.instanceCount;
            iArr[i9 + 1] = i9;
            Test.instanceCount ^= 24140;
            i8 -= i10;
            i11 = 9;
            do {
                if (true) break;
                for (i12 = 1; 1 > i12; ++i12) {
                    Test.instanceCount = (long)d1;
                    Test.instanceCount *= Test.byFld;
                    i8 += (i12 - i13);
                    f1 = i13;
                }
                Test.instanceCount -= -63531;
            } while (--i11 > 0);
        }
        vMeth1_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(boolean b, float f, int i7) {


        vMeth1(i7);
        vMeth_check_sum += (b ? 1 : 0) + Float.floatToIntBits(f) + i7;
    }

    public static long lMeth(int i2) {

        int i3=125, i4=200, i5=9, i6=-96, i14=-129, i15=-207;
        double d2=83.112801;
        float f2=48.288F;

        for (i3 = 12; i3 < 300; ++i3) {
            for (i5 = 1; i5 < 6; ++i5) {
                boolean b1=true;
                i4 = i6;
                switch (((-86 >>> 1) % 5) + 102) {
                case 102:
                    vMeth(b1, 54.911F, i5);
                    break;
                case 103:
                    switch ((i5 % 5) + 115) {
                    case 115:
                        if (b1) continue;
                        i6 -= (int)d2;
                    case 116:
                        for (i14 = 1; i14 < 2; i14++) {
                            if (i4 != 0) {
                            }
                            i15 >>= (int)Test.instanceCount;
                            if (i2 != 0) {
                            }
                            if (false) continue;
                            i2 &= i5;
                        }
                        i4 += i6;
                    case 117:
                        i4 = i14;
                    case 118:
                        i6 += i5;
                    case 119:
                        i2 += (((i5 * Test.instanceCount) + Test.instanceCount) - i3);
                        break;
                    default:
                        f2 += (((i5 * i6) + i15) - i4);
                    }
                case 104:
                case 105:
                    i15 += i5;
                case 106:
                    Test.iArrFld[i3 + 1] = -16;
                    break;
                default:
                    i15 = i6;
                }
            }
        }
        long meth_res = i2 + i3 + i4 + i5 + i6 + Double.doubleToLongBits(d2) + i14 + i15 + Float.floatToIntBits(f2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr3) {

        int i16=-14, i17=-74, i18=2, i19=63197, i20=-8, i21=63, i22=-5;
        boolean b2=true;

        Test.instanceCount = ((~(Test.byFld--)) * lMeth(i16));
        for (i17 = 237; i17 > 3; --i17) {
            for (i19 = 4; i19 < 107; i19++) {
                fFld += (i19 + Test.instanceCount);
                i20 -= i19;
                i21 = 1;
                do {
                    Test.instanceCount = i19;
                    i18 *= 238;
                    switch (((i18 >>> 1) % 9) + 82) {
                    case 82:
                        i18 = i19;
                    case 83:
                    case 84:
                        i18 >>= 32613;
                        break;
                    case 85:
                    case 86:
                        Test.byFld = (byte)i20;
                        break;
                    case 87:
                        i18 += (((i21 * fFld) + Test.instanceCount) - i18);
                        Test.iArrFld = Test.iArrFld;
                        break;
                    case 88:
                        Test.iArrFld[i19 + 1] += i17;
                        switch (((i19 % 2) * 5) + 46) {
                        case 49:
                        case 52:
                            if (b2) {
                                Test.iArrFld[i17 - 1] = (int)14L;
                            }
                            try {
                                i18 = (Test.iArrFld[i21 + 1] % i18);
                                i18 = (-26 % i19);
                                i18 = (i17 % Test.iArrFld[i19 + 1]);
                            } catch (ArithmeticException a_e) {}
                            break;
                        }
                        fFld = Test.byFld;
                        break;
                    case 89:
                        i20 += (int)Test.instanceCount;
                        break;
                    case 90:
                        dFld = i19;
                        Test.instanceCount = i19;
                        if (b2) continue;
                        Test.instanceCount = (long)dFld;
                        break;
                    default:
                        i18 += i21;
                    }
                    Test.iArrFld[i17 - 1] <<= i22;
                } while (++i21 < 2);
                dFld *= Test.instanceCount;
                Test.instanceCount += Test.instanceCount;
                i20 >>= i16;
            }
        }


    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
