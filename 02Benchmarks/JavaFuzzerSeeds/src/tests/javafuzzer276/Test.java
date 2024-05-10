package tests.javafuzzer276;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:09:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1769825540951048470L;
    public static int iFld=-61432;
    public static int iFld1=-11956;
    public static float fFld=0.990F;
    public static volatile double dFld=-38.55525;
    public static boolean bFld=true;
    public volatile short sFld=17636;
    public long lFld=3152487387L;
    public volatile int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, int i2, int i3) {

        int i4=-135, i5=-14488, i6=-37263, i7=157, i8=5, i9=162, i10=-144;
        double d=-2.40803;
        byte by=102;

        for (i4 = 200; i4 > 6; --i4) {
            d *= i4;
            l -= i2;
            i3 -= 3;
            i5 = (int)l;
            i6 = 1;
            do {
                for (i7 = 1; i7 < 1; ++i7) {
                    i8 = 12;
                }
                for (i9 = 1; i9 < 1; ++i9) {
                    i2 += (i9 - i10);
                    l -= i10;
                    if (true) break;
                    d += i2;
                    i10 <<= by;
                }
                i2 += (i6 ^ i10);
            } while (++i6 < 8);
        }
        vMeth2_check_sum += l + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d) + i6 + i7 + i8 + i9 + i10 + by;
    }

    public static void vMeth1() {

        int i11=-14, i12=52864, i13=58895, i14=-10, i15=-179, i16=-8, i17=-1, i18=4181, iArr[]=new int[N];
        short s=-18530;
        boolean b=true, bArr[]=new boolean[N];
        long l1=-8L;
        byte byArr[]=new byte[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(byArr, (byte)101);
        FuzzerUtils.init(fArr, 58.858F);
        FuzzerUtils.init(iArr, -20291);
        FuzzerUtils.init(bArr, true);

        vMeth2(Test.instanceCount, Test.iFld, Test.iFld);
        for (i11 = 6; i11 < 285; ++i11) {
            switch (((i12 >>> 1) % 10) + 43) {
            case 43:
                for (i13 = 6; i11 < i13; i13--) {
                    byArr[i11 - 1] += (byte)2.976F;
                }
            case 44:
                for (i15 = 1; i15 < 6; i15++) {
                    fArr[i11 - 1] *= 2.253F;
                }
                break;
            case 45:
                iArr[i11] |= i12;
                s = (short)i13;
                i16 += Test.iFld1;
                Test.instanceCount += i14;
            case 46:
                Test.fFld = i15;
                break;
            case 47:
                for (i17 = 1; 6 > i17; i17++) {
                    Test.iFld -= (int)Test.dFld;
                    Test.fFld += (-1.731F + (i17 * i17));
                }
                break;
            case 48:
                i12 += -245;
            case 49:
                bArr[i11 - 1] = b;
            case 50:
            case 51:
            case 52:
                l1 = i13;
                break;
            }
        }
        vMeth1_check_sum += i11 + i12 + i13 + i14 + i15 + i16 + s + i17 + i18 + (b ? 1 : 0) + l1 +
            FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth() {

        int i19=-150, i20=-175, i21=-48748, i22=-1, i23=-8;
        short s1=8930, sArr[]=new short[N];
        boolean b1=false;

        FuzzerUtils.init(sArr, (short)-25369);

        vMeth1();
        Test.iFld1 += 48650;
        Test.dFld %= 7199722469108968163L;
        for (i19 = 13; 334 > i19; i19++) {
            if (true) {
            } else if (b1) {
                Test.iFld1 = Test.iFld;
                i21 = 1;
                while (++i21 < 5) {
                    for (i22 = 1; i22 < 1; ++i22) {
                        i20 += i22;
                        Test.iFld -= s1;
                        Test.fFld += i22;
                    }
                }
            }
            i20 *= i21;
            if (false) break;
            Test.iFld += (((i19 * Test.fFld) + Test.fFld) - Test.instanceCount);
            sArr[i19] = (short)i21;
        }
        vMeth_check_sum += i19 + i20 + i21 + i22 + i23 + s1 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-63406, i1=42, i24=8292, i25=2470, i26=7;
        byte by1=56;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 3L);

        for (i = 5; i < 348; ++i) {
            vMeth();
            Test.bFld = true;
            sFld += (short)i1;
            Test.fFld += Test.instanceCount;
            i24 = 1;
            do {
                i25 = 1;
                do {
                    Test.bFld = Test.bFld;
                    Test.iFld *= -55915;
                    Test.dFld += Test.dFld;
                    try {
                        i1 = (i % iArrFld[i24]);
                        iArrFld[i25 - 1] = (i / iArrFld[i25 + 1]);
                        Test.iFld = (Test.iFld % 33094);
                    } catch (ArithmeticException a_e) {}
                    i1 *= (int)lFld;
                    lFld *= -246;
                } while (++i25 < 1);
                Test.fFld *= Test.instanceCount;
                Test.iFld1 -= i;
                Test.iFld = 6;
                Test.iFld1 = (int)lFld;
                lFld += i25;
            } while (++i24 < 73);
            by1 += (byte)i1;
            iArrFld[i + 1] |= i;
        }
        i26 = 1;
        while (++i26 < 291) {
            Test.iFld = i25;
            lFld += (((i26 * Test.instanceCount) + i1) - Test.iFld);
            Test.iFld = i;
            i1 += (i26 * i26);
            i1 -= i25;
        }
        i1 <<= i24;
        Test.iFld = (int)lFld;
        i1 = (int)-183L;
        Test.iFld1 = i26;



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
