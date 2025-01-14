package tests.javafuzzer2651;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 17:59:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2205639167L;
    public static short sFld=24595;
    public static float fFld=0.531F;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 23348);
        FuzzerUtils.init(Test.fArrFld, 34.258F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f1, short s1) {

        int i11=249, i12=-34, i13=-14, i14=-46478, i15=113, i16=-59691, i17=-223, i18=14;
        byte by=-42;
        double d1=-67.15635;

        Test.instanceCount *= 20;
        for (i11 = 21; i11 < 395; ++i11) {
            switch ((i11 % 4) + 47) {
            case 47:
                Test.instanceCount = Test.instanceCount;
                Test.instanceCount = i11;
                break;
            case 48:
                Test.iArrFld = Test.iArrFld;
                for (i13 = 1; i13 < 5; i13 += 3) {
                    by &= (byte)i14;
                    for (i15 = i11; i15 < 5; i15++) {
                        i12 += (int)120.99876;
                    }
                }
                break;
            case 49:
                i17 = 1;
                do {
                    d1 *= -8;
                    i16 += i17;
                    Test.iArrFld[i17 - 1] = (int)Test.instanceCount;
                    i18 += (i17 + Test.instanceCount);
                } while (++i17 < 5);
                break;
            case 50:
                Test.instanceCount = i14;
            default:
                f1 = i12;
            }
        }
        vMeth2_check_sum += Float.floatToIntBits(f1) + s1 + i11 + i12 + i13 + i14 + by + i15 + i16 + i17 +
            Double.doubleToLongBits(d1) + i18;
    }

    public static void vMeth1(int i6, int i7, int i8) {

        int i9=47388, i10=13, i19=10, i20=-38, i21=-23656, i22=60544, i23=-25961, i24=30589;
        boolean b=true;

        for (i9 = 4; 131 > i9; i9++) {
            vMeth2(-1.1005F, Test.sFld);
        }
        i19 = 1;
        do {
            if (b) {
                switch ((((12 >>> 1) % 2) * 5) + 15) {
                case 16:
                    Test.instanceCount /= (i6 | 1);
                    for (i20 = 1; 6 > i20; ++i20) {
                        Test.instanceCount ^= Test.instanceCount;
                    }
                    i7 >>= i21;
                    Test.instanceCount -= -32369L;
                    break;
                case 21:
                    for (i22 = 1; i22 < 6; i22++) {
                        if (b) {
                            Test.iArrFld = Test.iArrFld;
                        } else if (b) {
                            i8 <<= i23;
                            i24 += (((i22 * Test.instanceCount) + Test.instanceCount) - Test.instanceCount);
                        } else {
                            Test.sFld += (short)(-19913 + (i22 * i22));
                        }
                    }
                    break;
                }
            }
        } while (++i19 < 258);
        vMeth1_check_sum += i6 + i7 + i8 + i9 + i10 + i19 + i20 + i21 + i22 + i23 + i24 + (b ? 1 : 0);
    }

    public static void vMeth(short s, int i1) {

        float f=-1.207F;
        double d=-2.113136;
        int i2=-6, i3=35510, i4=6, i5=11, i25=-158, i26=20045, i27=-29, i28=-5454;

        i1 &= (int)((--f) - d);
        i1 ^= Math.max(-(4808 * (i1 - i1)), i1);
        for (i2 = 6; i2 < 342; ++i2) {
            Test.iArrFld[i2 - 1] -= (int)(-79.109699 * i2);
            for (i4 = 1; i4 < 5; i4 += 3) {
                s += (short)(i4 + i1);
                Test.instanceCount += (((i4 * i2) + i4) - i3);
            }
            Test.iArrFld[i2] >>= -120;
            vMeth1(i1, -38509, i4);
            f -= i3;
            for (i25 = 5; i25 > i2; i25--) {
                for (i27 = 1; 1 > i27; ++i27) {
                    Test.iArrFld = Test.iArrFld;
                    i28 &= (int)Test.instanceCount;
                    i1 = (int)Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += s + i1 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + i25 +
            i26 + i27 + i28;
    }

    public void mainTest(String[] strArr1) {

        int i29=-12, i30=-64464, i31=84, i32=1522, i33=11, i34=12;
        double d2=-2.43084, d3=1.26892;
        boolean b1=false;

        for (int i : Test.iArrFld) {
            i = i;
            vMeth(Test.sFld, i);
            for (i29 = 1; i29 < 63; ++i29) {
                Test.instanceCount -= (long)d2;
                i31 = 1;
                while (++i31 < 2) {
                    i *= (int)d2;
                }
                i32 = 1;
                do {
                    i30 *= i31;
                    i30 |= (int)Test.instanceCount;
                    if (b1) continue;
                    i += (i32 * Test.instanceCount);
                    Test.instanceCount = -20832;
                    Test.fArrFld[i29] *= Test.instanceCount;
                    i30 += (i32 * i32);
                    i30 += (i32 + i29);
                    i30 = i31;
                    i30 -= i31;
                } while (++i32 < 2);
                Test.fFld += i29;
                i30 += (int)Test.instanceCount;
                b1 = b1;
                Test.instanceCount += i29;
                Test.instanceCount >>>= i30;
                for (d3 = 1; d3 < 2; ++d3) {
                    i30 = i29;
                    Test.instanceCount = (long)d2;
                    Test.iArrFld[i29] -= 113;
                    Test.fFld += (float)d3;
                    Test.iArrFld[i29] <<= (int)Test.instanceCount;
                    i30 += (int)(((d3 * i30) + i32) - i34);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
