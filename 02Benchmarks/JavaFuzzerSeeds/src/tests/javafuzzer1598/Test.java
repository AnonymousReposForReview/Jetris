package tests.javafuzzer1598;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:37:25 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=23039L;
    public boolean bFld=false;
    public float fFld=50.175F;
    public static double dFld=0.17627;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i1=-171, i2=-181, i3=-16601, i4=146, iArr[]=new int[N];
        short s=-2047;
        double d=0.129514, d1=25.57061;
        boolean b=false;

        FuzzerUtils.init(iArr, 3);

        i1 = 238;
        while ((i1 -= 2) > 0) {
            i2 += (i1 ^ i2);
        }
        i2 = (int)Test.instanceCount;
        s <<= (short)i2;
        iArr[(i1 >>> 1) % N] += (int)d;
        i2 = i3;
        Test.instanceCount = i2;
        for (d1 = 4; d1 < 144; ++d1) {
            if (true) break;
            iArr[(int)(d1)] = (int)d1;
            i3 += i4;
            i2 += (int)d1;
            if (b) break;
            d = i2;
            iArr[(int)(d1)] = (int)Test.instanceCount;
        }
        vMeth2_check_sum += i1 + i2 + s + Double.doubleToLongBits(d) + i3 + Double.doubleToLongBits(d1) + i4 + (b ? 1 :
            0) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i) {

        int i5=-76, i6=33911, i7=63449, i8=10, i9=4, i10=205, i11=1, iArr1[]=new int[N];
        boolean b1=true;
        float f=84.625F;
        byte by=-85;

        FuzzerUtils.init(iArr1, 27963);

        vMeth2();
        i5 = 1;
        do {
            i >>= (int)Test.instanceCount;
        } while (++i5 < 318);
        for (i6 = 5; i6 < 193; ++i6) {
            i7 += (i6 | i6);
            iArr1 = iArr1;
            i7 = (int)Test.instanceCount;
            for (i8 = 1; i8 < 8; i8++) {
                i += (i8 + i9);
                for (i10 = 1; i10 < 2; i10++) {
                    if (b1) break;
                    i11 += i8;
                    try {
                        i9 = (i6 / 142);
                        i11 = (74 / i6);
                        iArr1[i6] = (12255 / iArr1[i6]);
                    } catch (ArithmeticException a_e) {}
                }
                f += 14;
                Test.instanceCount -= by;
            }
        }
        vMeth1_check_sum += i + i5 + i6 + i7 + i8 + i9 + i10 + i11 + (b1 ? 1 : 0) + Float.floatToIntBits(f) + by +
            FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth() {

        int i12=11, i13=-108, i14=2, i15=-114, i16=-59, i17=-13, i18=201, i19=-1;
        float f1=-56.339F;

        vMeth1(-12);
        i12 = i12;
        for (i13 = 13; i13 < 213; ++i13) {
            if (bFld) continue;
            fFld = i12;
        }
        for (i15 = 272; i15 > 8; i15--) {
            for (i17 = 1; i17 < 6; i17++) {
                i19 = 1;
                while (++i19 < 2) {
                    i16 -= i17;
                    i12 = 11;
                    fFld *= f1;
                    i14 >>= -232;
                    Test.instanceCount += i19;
                    fFld -= 12;
                    fFld = Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += i12 + i13 + i14 + i15 + i16 + i17 + i18 + i19 + Float.floatToIntBits(f1);
    }

    public void mainTest(String[] strArr1) {

        int i20=-13, i21=-57, i22=7577, i23=-129, i24=65505, iArr2[]=new int[N];
        byte by1=-115;
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr2, 34283);
        FuzzerUtils.init(lArr, -55026L);
        FuzzerUtils.init(fArr, 0.343F);

        vMeth();
        i20 = 1;
        while (++i20 < 210) {
            for (i21 = 120; 7 < i21; i21 -= 3) {
                iArr2[i20 - 1] = (int)Test.instanceCount;
                lArr[i21 + 1] = i21;
                fArr[i20 + 1] = 32;
                switch (((i21 % 2) * 5) + 9) {
                case 14:
                    i22 += i21;
                    i22 = i21;
                case 18:
                    i22 -= i20;
                default:
                    i22 *= i20;
                    by1 = (byte)13;
                    Test.instanceCount *= i22;
                    i22 += i20;
                }
                switch ((i21 % 1) + 97) {
                case 97:
                    for (i23 = 1; 4 > i23; ++i23) {
                        i22 -= i20;
                        switch ((i23 % 2) + 73) {
                        case 73:
                            iArr2 = iArr2;
                            break;
                        case 74:
                            bFld = false;
                            Test.dFld = -11359;
                            Test.instanceCount >>= 3;
                            break;
                        default:
                            if (bFld) break;
                            i22 = i22;
                            i24 = (int)Test.instanceCount;
                        }
                        i24 = (int)Test.instanceCount;
                        Test.instanceCount += by1;
                        bFld = bFld;
                        Test.instanceCount += i23;
                    }
                    i22 -= i20;
                    break;
                default:
                    i24 -= i24;
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
