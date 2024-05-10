package tests.javafuzzer920;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:32:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-24L;
    public byte byFld=54;
    public static volatile double dFld=89.105240;
    public byte byArrFld[]=new byte[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i5, int i6, int i7) {

        int i8=-78, i9=13, i10=112, i11=-13, i12=-28244, i13=-155, iArr[]=new int[N];
        short s=22681;
        float f1=0.433F;
        byte by=-110;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(lArr, -62323L);

        Test.instanceCount += Test.instanceCount;
        for (i8 = 1; i8 < 336; i8++) {
            s += (short)Test.instanceCount;
            iArr[i8 + 1] -= i9;
            switch ((i8 % 1) + 76) {
            case 76:
                for (i10 = 1; i10 < 5; ++i10) {
                    i7 += (int)-60174L;
                    for (i12 = 1; i12 < 2; i12 += 3) {
                        i6 += (i12 * i10);
                        i11 *= (int)Test.instanceCount;
                        i5 >>= 1;
                        i11 *= i5;
                        i7 = i9;
                        f1 += i8;
                    }
                    lArr[i8] = -7796;
                }
                break;
            default:
                by += (byte)i8;
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + s + i10 + i11 + i12 + i13 + Float.floatToIntBits(f1) + by +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth() {

        int i2=28269, i3=-1, i4=-138, i15=-76, i16=-49190, i17=-20268, iArr1[]=new int[N];
        float f=114.882F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, 7);
        FuzzerUtils.init(lArr1, 589380642L);

        for (i2 = 318; i2 > 1; i2 -= 3) {
            for (f = 1; f < 15; ++f) {
                Test.instanceCount += Test.instanceCount;
                vMeth1(i3, -6, i3);
            }
            for (i15 = 15; i15 > 1; i15--) {
                lArr1[i2] = Test.instanceCount;
                byFld = (byte)f;
                lArr1[i15] = i3;
                i17 = 1;
                while (++i17 < 2) {
                    try {
                        iArr1[i15] = (-133 / i3);
                        i3 = (20982 % i4);
                        i4 = (i3 / i16);
                    } catch (ArithmeticException a_e) {}
                }
                iArr1[i2 + 1] -= i2;
                i16 -= (int)f;
                i3 <<= i4;
                try {
                    i3 = (-238 / iArr1[i15 - 1]);
                    i3 = (iArr1[i2 - 1] / 185);
                    iArr1[i2] = (i15 / i2);
                } catch (ArithmeticException a_e) {}
                byFld += (byte)i15;
            }
        }
        vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f) + i4 + i15 + i16 + i17 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr1);
    }

    public int iMeth(int i, int i1) {

        long l=236L, lArr2[]=new long[N];
        int i18=-10, i19=25470;
        float f2=0.568F;

        FuzzerUtils.init(lArr2, 557488952L);

        vMeth();
        for (l = 18; l < 312; l++) {
            Test.instanceCount += (l | i18);
            i = i18;
            i18 += (12476 + (l * l));
            f2 = l;
            i19 = 1;
            do {
                i1 = i19;
                i = i18;
                i1 += (((i19 * i18) + i19) - i18);
                byArrFld = byArrFld;
                Test.instanceCount <<= 32916;
                lArr2[i19] = i18;
                i = i1;
                byArrFld[(int)(l)] *= (byte)Test.dFld;
            } while (++i19 < 6);
        }
        long meth_res = i + i1 + l + i18 + Float.floatToIntBits(f2) + i19 + FuzzerUtils.checkSum(lArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i20=7, i21=59353, i22=-82, i23=23926, i24=12, i25=-216, i26=50727, i27=136, i28=-11286, i29=9677,
            i30=47967, i31=179, i32=9, i33=3, iArr2[]=new int[N];
        float f3=0.356F;
        boolean b=false;
        long lArr3[]=new long[N];

        FuzzerUtils.init(iArr2, -206);
        FuzzerUtils.init(lArr3, 3144953515119769983L);

        Test.instanceCount -= iMeth(i20, i20);
        for (i21 = 21; i21 < 368; ++i21) {
            i20 += i21;
            for (i23 = 73; i23 > i21; i23--) {
                i25 = 1;
                do {
                    i24 += (((i25 * f3) + Test.instanceCount) - Test.instanceCount);
                    Test.dFld = -45L;
                    f3 *= i21;
                    i20 += i21;
                    i24 += 14;
                } while (++i25 < 1);
                i24 -= i20;
                i24 += (i23 + i20);
                i22 = 8;
                i22 += (((i23 * i21) + i24) - Test.instanceCount);
            }
            i24 += (((i21 * i24) + i22) - f3);
            for (i26 = 73; i26 > 2; i26--) {
                iArr2[i26 + 1] = i21;
                i24 %= (int)(Test.instanceCount | 1);
                if (b) break;
            }
            Test.instanceCount <<= i25;
            for (i28 = i21; i28 < 73; i28++) {
                for (i30 = 1; i30 < 1; ++i30) {
                    i31 = (int)3808515086L;
                    f3 -= i29;
                }
                for (i32 = 1; 1 > i32; ++i32) {
                    Test.instanceCount -= 56612;
                    if (b) break;
                    lArr3[i21] -= i25;
                    Test.instanceCount = i33;
                    byFld += (byte)(i32 | Test.instanceCount);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}