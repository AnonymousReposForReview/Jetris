package tests.javafuzzer733;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:43:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=31L;
    public static volatile double dFld=88.88211;
    public static float fFld=-35.745F;
    public short sFld=-27828;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 11743);
        FuzzerUtils.init(Test.dArrFld, 0.70763);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i12=-191, i13=-227, i14=-5, i15=-4, i16=4, i17=5, i18=250, i19=14513;
        long l=-51L;
        short s1=-30363;

        i12 -= (int)Test.dFld;
        for (l = 12; l < 319; l++) {
            switch ((int)((l % 7) + 33)) {
            case 33:
                for (i14 = 5; i14 > 1; i14 -= 3) {
                    Test.iArrFld[i14] -= i13;
                    Test.instanceCount = Test.instanceCount;
                    Test.fFld += Test.fFld;
                    for (i16 = i14; i16 < 5; i16++) {
                        i15 += i16;
                        Test.iArrFld[(int)(l - 1)] = -2093;
                        i15 += (i16 * i16);
                    }
                    s1 = (short)i17;
                    for (i18 = 1; i18 < 5; ++i18) {
                        Test.fFld += (((i18 * i16) + i13) - i17);
                        i12 += -25656;
                    }
                }
                break;
            case 34:
                i17 = i14;
                break;
            case 35:
                Test.fFld = l;
                break;
            case 36:
                i12 = 43214;
            case 37:
                i12 >>= i12;
                break;
            case 38:
                i15 -= i18;
                break;
            case 39:
                i12 <<= i18;
            default:
                Test.iArrFld[(int)(l)] = s1;
            }
        }
        vMeth1_check_sum += i12 + l + i13 + i14 + i15 + i16 + i17 + s1 + i18 + i19;
    }

    public static int iMeth() {

        int i10=35380, i11=7;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -19.552F);

        for (i10 = 2; i10 < 130; ++i10) {
            fArr[i10] -= ((-(i11 - i11)) + Test.instanceCount);
            i11 += (i10 * i10);
            vMeth1();
            i11 = i11;
        }
        i11 += i11;
        long meth_res = i10 + i11 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i5=-13, i6=52567, i7=-6, i8=-225, i9=-230, i20=26153, i21=54073, i22=-201;
        byte by=-1;
        short s2=9595;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 234L);

        i5 = 1;
        do {
            for (i6 = 1; i6 < 9; ++i6) {
                for (i8 = 2; i8 > 1; i8--) {
                    Test.dArrFld[i6] += (iMeth() * Test.instanceCount);
                    by *= (byte)s2;
                    lArr[i5 + 1] *= (long)Test.fFld;
                }
                for (i20 = i5; i20 < 2; i20++) {
                    i7 *= i8;
                    if (i21 != 0) {
                        vMeth_check_sum += i5 + i6 + i7 + i8 + i9 + by + s2 + i20 + i21 + i22 +
                            FuzzerUtils.checkSum(lArr);
                        return;
                    }
                }
                Test.instanceCount += i8;
                Test.dFld -= 13473;
                i22 = 1;
                while (++i22 < 2) {
                    Test.iArrFld[i22 + 1] *= -32558;
                    Test.dFld = Test.dFld;
                    i7 = i9;
                }
            }
        } while (++i5 < 181);
        vMeth_check_sum += i5 + i6 + i7 + i8 + i9 + by + s2 + i20 + i21 + i22 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr3) {

        int i1=-5, i2=-221, i3=-154, i4=26153, i23=-221, i24=8, i25=42, i26=-13, i27=28696;
        boolean b=false, bArr[]=new boolean[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -241L);
        FuzzerUtils.init(bArr, true);

        for (i1 = 8; i1 < 365; i1++) {
            for (i3 = 2; i3 < 71; i3++) {
                i4 %= (int)(Test.iArrFld[i1 - 1] | 1);
                vMeth();
                i2 *= i3;
                i23 = 1;
                while (++i23 < 2) {
                    Test.fFld += (92921177L + (i23 * i23));
                    sFld = (short)-5514788773816020879L;
                    lArr1[i1] = i1;
                    Test.iArrFld[i1 - 1] *= (int)Test.dFld;
                    i4 *= i1;
                    i2 = (int)Test.dFld;
                    bArr[i3 + 1] = b;
                    i2 |= i24;
                    i24 += i1;
                    i24 += (int)Test.instanceCount;
                }
                Test.instanceCount -= i25;
                i25 -= i2;
                bArr[i1 - 1] = b;
                Test.instanceCount >>>= 1766379283L;
                i2 -= 253;
                i25 += (((i3 * i1) + i25) - Test.instanceCount);
            }
            for (i26 = 4; 71 > i26; ++i26) {
                i4 += -3;
                i24 -= i27;
                i4 = i4;
                i2 = (int)2373L;
            }
            Test.fFld += Test.fFld;
            if (true) break;
            i24 += (int)Test.dFld;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
