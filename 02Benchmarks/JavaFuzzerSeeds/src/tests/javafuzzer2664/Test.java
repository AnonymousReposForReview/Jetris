package tests.javafuzzer2664;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 18:19:52 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=51976L;
    public volatile double dFld=-46.22816;
    public static float fFld=2.31F;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 179);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public void vMeth1() {

        float f=-100.958F;
        long l1=3L;
        int i5=-8;

        f *= (((l1++) - (i5 = i5)) * ((Test.instanceCount - i5) + -60966L));
        vMeth1_check_sum += Float.floatToIntBits(f) + l1 + i5;
    }

    public static void vMeth2(float f1, int i9, byte by1) {

        int iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -151);

        iArr1[(-9 >>> 1) % N] = 171;
        vMeth2_check_sum += Float.floatToIntBits(f1) + i9 + by1 + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(long l2, int i6, byte by) {

        int i7=9047, i8=87, i10=143, i11=-7, i12=-34902, i13=-53326, i14=37104, i15=-79;
        double d1=0.64028;
        short s=28021;

        for (i7 = 164; 10 < i7; i7--) {
            vMeth2(-1.398F, i6, by);
            i6 = i6;
        }
        i6 += i7;
        for (d1 = 14; d1 < 326; ++d1) {
            l2 ^= Test.instanceCount;
            Test.instanceCount *= l2;
            for (i11 = 1; i11 < 5; ++i11) {
                try {
                    i10 = (i11 % i7);
                    Test.iArrFld[i11 - 1] = (Test.iArrFld[i11 + 1] % -14131);
                    i13 = (-7225 / i13);
                } catch (ArithmeticException a_e) {}
            }
            i13 = 5;
            s = s;
        }
        for (i14 = 176; i14 > 2; --i14) {
            boolean b=true;
            i8 = by;
            if (b) continue;
        }
        Test.iArrFld[(i7 >>> 1) % N] = i10;
        long meth_res = l2 + i6 + by + i7 + i8 + Double.doubleToLongBits(d1) + i10 + i11 + i12 + i13 + s + i14 + i15;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(int i2, long l, double d) {

        int i3=2, i4=-4, i16=119, i17=178, i18=14, iArr[]=new int[N];
        byte by2=-47;
        float f2=-1.918F;

        FuzzerUtils.init(iArr, -115);

        for (i3 = 8; 189 > i3; i3++) {
            vMeth1();
            vMeth1();
            switch ((((((int)(4097009488L + (iArr[i3]++))) >>> 1) % 5) * 5) + 119) {
            case 141:
                vMeth1();
                i4 -= ((iMeth(Test.instanceCount, 54412, (byte)(-83)) - i4) + -6);
                i4 = i3;
                if (false) break;
                break;
            case 121:
                i16 = 9;
                while (--i16 > 0) {
                    by2 = (byte)i16;
                    Test.instanceCount += -157;
                    l *= Test.instanceCount;
                }
            case 134:
                for (i17 = 1; i17 < 9; i17++) {
                    i18 -= i4;
                    f2 = i4;
                }
                break;
            case 133:
                Test.iArrFld[i3 - 1] += (int)Test.instanceCount;
            case 139:
                if (false) break;
                break;
            }
        }
        vMeth_check_sum += i2 + l + Double.doubleToLongBits(d) + i3 + i4 + i16 + by2 + i17 + i18 +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-52, i1=-46, i19=-14, i20=-234, i21=-13, i22=-7, i23=7630, i24=-6, i25=35480, i26=-57590;
        byte by3=116;
        boolean b1=false;
        short s1=19703;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -56691L);

        for (i = 14; i < 366; i++) {
            vMeth(i1, Test.instanceCount, dFld);
            i1 += i;
            i1 += i;
        }
        i1 = i1;
        i19 = 1;
        do {
            i1 -= (int)Test.instanceCount;
            lArr[i19][i19] += i19;
        } while (++i19 < 208);
        i1 -= i19;
        for (i20 = 4; i20 < 170; i20 += 3) {
            i1 += (((i20 * i20) + by3) - Test.instanceCount);
        }
        Test.iArrFld[(i20 >>> 1) % N] *= (int)Test.instanceCount;
        i22 = 1;
        while ((i22 += 3) < 276) {
            lArr[i22 + 1][i22] = i1;
            for (i23 = 1; i23 < 272; i23++) {
                i1 = i22;
                i21 >>= i23;
                b1 = b1;
                Test.iArrFld[i23] = (int)Test.instanceCount;
                b1 = b1;
                i1 = s1;
                i21 += i23;
                Test.instanceCount >>= -6;
                i1 -= i1;
            }
            for (i25 = 1; 272 > i25; i25++) {
                dFld *= i23;
                Test.instanceCount += Test.instanceCount;
                if (b1) break;
                try {
                    i21 = (Test.iArrFld[i25 + 1] / Test.iArrFld[i25 - 1]);
                    i1 = (i20 % -251);
                    i26 = (i26 % i25);
                } catch (ArithmeticException a_e) {}
                Test.fFld = -111.121F;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
