package tests.javafuzzer1415;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 19:55:33 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-1056650321L;
    public static volatile double dFld=-19.122190;
    public static volatile boolean bFld=false;
    public static long lFld=-796369222L;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 36739);
    }

    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, int i8, float f1) {

        int i9=9, i10=21, i11=-4, i12=87, i13=240, i14=1;
        short s=20832;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 12.526F);

        for (i9 = 3; i9 < 128; ++i9) {
            i10 += (i9 ^ i7);
            i10 -= i8;
            f1 *= i8;
            fArr[i9 + 1] = i9;
        }
        f1 *= 166;
        for (i11 = 16; i11 < 365; i11++) {
            try {
                i8 = (2801 % i9);
                i7 = (i7 % i9);
                i12 = (-56 % i7);
            } catch (ArithmeticException a_e) {}
            i7 += -13;
            i10 = (int)f1;
            for (i13 = 5; i13 > 1; i13--) {
                s -= (short)58485;
                i10 -= i11;
                Test.instanceCount += (((i13 * i14) + i14) - i11);
                Test.instanceCount -= i13;
            }
        }
        vMeth1_check_sum += i7 + i8 + Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 + i13 + i14 + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static byte byMeth(int i3) {

        long l=29495L;
        int i4=-9, i5=8, i6=13, i15=63748, i16=-11947, iArr1[]=new int[N];
        float f2=106.767F;
        boolean b=false;

        FuzzerUtils.init(iArr1, -41682);

        for (l = 8; l < 376; ++l) {
            for (i5 = 1; i5 < 5; ++i5) {
                vMeth1(i5, i5, f2);
            }
            switch ((int)((l % 4) + 69)) {
            case 69:
                i3 += (63 + (l * l));
                break;
            case 70:
                b = b;
                break;
            case 71:
                i3 = i4;
                iArr1[(int)(l + 1)] = i4;
                i15 = i6;
            case 72:
                i16 = 1;
                while (++i16 < 5) {
                    iArr1[(int)(l)] *= (int)l;
                    i4 += (i16 - i5);
                    i15 *= i4;
                    f2 = i4;
                    i4 *= -10;
                }
                break;
            }
        }
        long meth_res = i3 + l + i4 + i5 + i6 + Float.floatToIntBits(f2) + (b ? 1 : 0) + i15 + i16 +
            FuzzerUtils.checkSum(iArr1);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth() {

        int i2=-71, i17=-7, i18=-179, i19=-238, i20=56664, i21=-11, i22=-21, i23=-72, i24=22863, iArr[]=new int[N];
        float f3=-2.444F, fArr1[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 186);
        FuzzerUtils.init(lArr, 18693L);
        FuzzerUtils.init(fArr1, 127.117F);

        iArr[(i2 >>> 1) % N] += byMeth(i2);
        for (i17 = 8; i17 < 251; ++i17) {
            f3 = i18;
            for (i19 = 1; i19 < 7; ++i19) {
                for (i21 = 1; i21 < 2; i21++) {
                    i2 *= (int)Test.dFld;
                    Test.dFld *= Test.instanceCount;
                }
                lArr[i19 + 1] = i2;
            }
            fArr1[i17 - 1] = -46;
            iArr[i17] |= i2;
            if (i18 != 0) {
                vMeth_check_sum += i2 + i17 + i18 + Float.floatToIntBits(f3) + i19 + i20 + i21 + i22 + i23 + i24 +
                    FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
                return;
            }
            i23 = 1;
            while (++i23 < 7) {
                i24 = 1;
                do {
                    if (Test.bFld) continue;
                    i20 = i18;
                } while (++i24 < 1);
            }
        }
        vMeth_check_sum += i2 + i17 + i18 + Float.floatToIntBits(f3) + i19 + i20 + i21 + i22 + i23 + i24 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i=8, i1=-12851, i25=-88, i26=2, i27=-9, i28=-48830;
        float f=-24.997F;
        short s1=-327;
        byte by=60;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -174L);

        i = 1;
        do {
            Test.instanceCount += (i1++);
            i1 = (int)(f++);
            vMeth();
            try {
                i1 = (Test.iArrFld[i + 1] / i1);
                i1 = (i1 % 213);
                i1 = (i1 % -50628);
            } catch (ArithmeticException a_e) {}
            i1 &= i;
            for (i25 = 6; i25 < 152; ++i25) {
                i1 >>= 0;
                i26 = i1;
                i26 += (i25 + i1);
                i26 = i1;
                f += (i25 - Test.instanceCount);
                lArr1 = lArr1;
                for (i27 = 1; i27 < 2; ++i27) {
                    i1 += (72 + (i27 * i27));
                    i26 = i1;
                    s1 += (short)i27;
                    i28 = (int)Test.instanceCount;
                    i1 += i27;
                    i28 = i28;
                    Test.instanceCount = i25;
                    Test.lFld = 2;
                    f *= i;
                    Test.iArrFld[i25 + 1] = (int)Test.lFld;
                }
                i1 = i27;
            }
            Test.instanceCount <<= i1;
            Test.instanceCount = i26;
            i28 = (int)Test.instanceCount;
        } while (++i < 165);
        by = (byte)60;
        i1 += i1;



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
//DEBUG  byMeth ->  byMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 byMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
