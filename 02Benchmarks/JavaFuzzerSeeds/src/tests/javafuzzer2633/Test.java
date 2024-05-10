package tests.javafuzzer2633;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 17:38:28 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2395621716L;
    public static float fFld=-81.767F;
    public static byte byFld=37;
    public int iFld=12365;
    public static volatile float fArrFld[]=new float[N];
    public volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 2.113F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        long l=-176L;
        int i8=-126, i9=14, i10=7, i11=-7, i12=11, i13=63017, i14=231, iArr1[]=new int[N];
        byte by=0;
        float f=-19.548F, fArr[]=new float[N];

        FuzzerUtils.init(iArr1, 185);
        FuzzerUtils.init(fArr, -2.456F);

        for (l = 8; l < 365; ++l) {
            try {
                i8 = (iArr1[(int)(l)] % -235);
                i8 = (-25801 / i9);
                i9 = (-95 % i8);
            } catch (ArithmeticException a_e) {}
            Test.fFld -= Test.instanceCount;
            for (i10 = 1; i10 < 5; ++i10) {
                iArr1[i10 + 1] *= (int)l;
                i8 += i10;
                by &= (byte)i10;
            }
            Test.instanceCount -= -1L;
        }
        for (f = 194; f > 12; f -= 2) {
            i12 += (5 + (f * f));
            i11 >>>= (int)l;
            for (i13 = 1; i13 < 17; ++i13) {
                i12 += (int)l;
                fArr[(int)(f)] *= i12;
                iArr1[i13] = i14;
            }
        }
        vMeth2_check_sum += l + i8 + i9 + i10 + i11 + by + Float.floatToIntBits(f) + i12 + i13 + i14 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1() {

        int i2=227, i3=-87, i4=56864, i5=126, i6=11, i7=2, iArr[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -130);
        FuzzerUtils.init(lArr, -1613956344L);

        for (i2 = 3; 205 > i2; ++i2) {
            for (i4 = 1; i4 < 8; i4++) {
                iArr = iArr;
            }
        }
        for (i6 = 195; i6 > 10; --i6) {
            vMeth2();
            lArr[i6 - 1] <<= Test.instanceCount;
            Test.fFld = Test.byFld;
            lArr = FuzzerUtils.long1array(N, (long)32321L);
            lArr[i6] -= i6;
            Test.fArrFld[i6 + 1] -= 5358674047220742055L;
            lArr[i6] += Test.instanceCount;
            iArr = iArr;
        }
        i7 = -99;
        i7 -= (int)Test.instanceCount;
        i3 = -58;
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth() {

        int i15=27976, i16=-39920, i17=-117, i18=-7, i19=-13407, i20=186, i21=-56983, iArr2[]=new int[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr2, 33754);
        FuzzerUtils.init(byArr, (byte)90);

        vMeth1();
        try {
            Test.byFld *= (byte)2.302F;
            for (i15 = 8; i15 < 146; ++i15) {
                for (i17 = 1; i17 < 11; i17++) {
                    i16 = 31286;
                    i19 = 1;
                    do {
                        if (false) continue;
                    } while (++i19 < 2);
                    Test.byFld += (byte)i17;
                    for (i20 = 1; 2 > i20; ++i20) {
                        i18 <<= i15;
                        iArr2[i17 + 1] *= (int)Test.fFld;
                        Test.fFld = i16;
                        i16 *= i18;
                        i18 += (-179 + (i20 * i20));
                    }
                }
            }
        }
        catch (ArithmeticException exc2) {
            i16 <<= i21;
        }
        catch (UserDefinedExceptionTest exc3) {
            i21 -= i16;
        }
        finally {
            byArr = byArr;
        }
        vMeth_check_sum += i15 + i16 + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-13, i1=0, i22=-43708, i23=11, i24=-51, i25=-4, i26=0, i27=-222, i28=-5, i29=2;
        long l1=-116L;
        double d=-39.6992, dArr[]=new double[N];

        FuzzerUtils.init(dArr, -14.48501);

        dArr[(i >>> 1) % N] *= (i++);
        i1 = 288;
        do {
            vMeth();
        } while (--i1 > 0);
        for (i22 = 185; i22 > 8; --i22) {
            i23 = i22;
            i24 = 1;
            do {
                iArrFld[i22 - 1] = i24;
                if (false) break;
                i25 = 1;
                do {
                    i23 += (int)l1;
                    i = i25;
                    Test.fFld += (i25 * i25);
                    Test.byFld = (byte)147;
                } while (++i25 < 1);
                i23 = i25;
                iFld = -2877;
                i -= -18;
                l1 += (41 + (i24 * i24));
                iFld ^= i;
                i23 = i1;
                i += (int)d;
            } while (++i24 < 142);
            switch (((i22 % 1) * 5) + 29) {
            case 33:
                iArrFld[i22 - 1] *= (int)l1;
                for (i26 = 142; i26 > 3; i26 -= 2) {
                    for (i28 = 3; i28 > 1; --i28) {
                        if (true) break;
                        l1 = i23;
                    }
                    iFld <<= (int)-8800L;
                    iFld -= i29;
                    i27 &= i23;
                }
                break;
            }
            Test.byFld >>= (byte)-31;
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
