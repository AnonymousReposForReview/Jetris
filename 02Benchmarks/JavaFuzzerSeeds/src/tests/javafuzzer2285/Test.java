package tests.javafuzzer2285;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 11:27:25 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=710413967L;
    public static short sFld=29465;
    public static float fFld=2.958F;
    public static int iFld=46880;
    public byte byFld=-90;
    public long lArrFld[]=new long[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4) {

        int i5=164, i6=-38815, i7=-1, i8=-142, i9=103, i10=6, i11=8, iArr1[]=new int[N];
        byte by=-46;

        FuzzerUtils.init(iArr1, -98);

        for (i5 = 1; i5 < 244; ++i5) {
            i4 += (((i5 * Test.instanceCount) + i6) - i4);
            i4 = (int)Test.instanceCount;
            Test.instanceCount = Test.instanceCount;
            iArr1[i5 - 1] = i6;
            i7 = 1;
            while (++i7 < 7) {
                i4 = (int)Test.fFld;
            }
            for (i8 = 1; i8 < 7; i8++) {
                if (i5 != 0) {
                    vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + by + FuzzerUtils.checkSum(iArr1);
                    return;
                }
                iArr1[i5 - 1] += i4;
                for (i10 = 1; i10 < 2; i10++) {
                    Test.instanceCount = Test.instanceCount;
                    by = (byte)i7;
                    Test.instanceCount += Test.instanceCount;
                    i9 = i4;
                }
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + by + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        long l=1124L;
        double d=111.84331, d1=-1.7907;
        int i12=9, i13=-215, i14=-4, i15=179;
        byte by1=80;

        Test.sFld >>= (short)(++Test.instanceCount);
        vMeth1(Test.iFld);
        Test.iFld = Test.iFld;
        l -= (long)d;
        if (true) {
            for (i12 = 1; i12 < 194; i12++) {
                for (i14 = 8; 1 < i14; i14--) {
                    by1 <<= (byte)13;
                    Test.iFld += i14;
                    d1 = 1;
                    do {
                        i15 = (int)Test.instanceCount;
                        Test.fFld += (float)d1;
                        Test.iFld -= (int)-3L;
                        Test.fFld *= Test.fFld;
                        l -= (long)Test.fFld;
                    } while (++d1 < 2);
                }
            }
        }
        vMeth_check_sum += l + Double.doubleToLongBits(d) + i12 + i13 + i14 + i15 + by1 + Double.doubleToLongBits(d1);
    }

    public int iMeth(int i1, int i2) {

        int i3=-8, i16=0, i17=-11700, i18=-3, i19=5, i20=14, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, -3);

        i3 = 1;
        do {
            vMeth();
            Test.iFld += Test.iFld;
            for (i16 = 1; i16 < 9; ++i16) {
                try {
                    i17 = (i3 / Test.iFld);
                    i17 = (164 % i2);
                    Test.iFld = (i1 % 122);
                } catch (ArithmeticException a_e) {}
                i18 |= i3;
                try {
                    i1 = (168 % i16);
                    i1 = (iArr2[i16] % i2);
                    iArr2[i16 + 1] = (i18 % i2);
                } catch (ArithmeticException a_e) {}
                i17 *= Test.iFld;
                Test.fFld += 150;
                Test.iFld -= i17;
                iArr2[i3 + 1] = (int)Test.fFld;
                for (i19 = 1; i19 < 2; i19++) {
                    i17 >>= -155;
                    Test.instanceCount += i1;
                    i20 = i18;
                }
            }
        } while (++i3 < 186);
        long meth_res = i1 + i2 + i3 + i16 + i17 + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=17, i21=-35705, i22=96, i23=60133, i24=-13, i25=4, i26=-50243, i27=-244, i28=12, i29=-23714, i30=-50025,
            i31=-2, iArr[]=new int[N];
        double d2=0.18923, d3=-1.60215;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -20);
        FuzzerUtils.init(fArr, -1.1000F);

        iArr[(i >>> 1) % N] -= (iMeth(i, Test.iFld) + i21);
        for (i22 = 11; 351 > i22; i22++) {
            for (i24 = 4; i24 < 74; i24++) {
                Test.iFld *= 0;
                Test.instanceCount *= 10805;
            }
            i *= (int)Test.instanceCount;
        }
        i21 = (int)Test.instanceCount;
        d2 = 1;
        do {
            for (i26 = 69; i26 > 1; --i26) {
                double d4=96.13925;
                switch ((((i22 >>> 1) % 6) * 5) + 30) {
                case 35:
                    i21 += (i26 | (long)Test.fFld);
                    break;
                case 43:
                    i27 += byFld;
                case 41:
                    i23 = (int)Test.instanceCount;
                    lArrFld[(int)(d2 - 1)] &= i21;
                    break;
                case 49:
                    for (d3 = 1; 2 > d3; d3++) {
                        fArr[(int)(d3 - 1)] += Test.sFld;
                        try {
                            i21 = (iArr[(int)(d2 - 1)] / iArr[(int)(d2 + 1)]);
                            i23 = (i23 / i22);
                            i = (iArr[(int)(d2 - 1)] % i28);
                        } catch (ArithmeticException a_e) {}
                        i += (int)(d3 * i21);
                        try {
                            iArr[i26 - 1] = (i25 / 50238);
                            i29 = (i28 / -79);
                            i25 = (i % i26);
                        } catch (ArithmeticException a_e) {}
                        i27 *= i26;
                        i27 += Test.sFld;
                        i28 += i28;
                        Test.instanceCount = i22;
                        byFld = (byte)-1898743680095868443L;
                        Test.iFld >>= i24;
                    }
                    for (i30 = 1; 2 > i30; ++i30) {
                        Test.instanceCount += (((i30 * i24) + i22) - Test.fFld);
                        iArr = FuzzerUtils.int1array(N, (int)-10);
                        iArr[i26 - 1] = byFld;
                        Test.fFld -= i21;
                    }
                    break;
                case 53:
                    Test.instanceCount = 64;
                    break;
                case 52:
                    d4 += Test.instanceCount;
                    break;
                }
            }
        } while (++d2 < 366);


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
