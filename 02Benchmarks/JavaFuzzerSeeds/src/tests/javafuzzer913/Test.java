package tests.javafuzzer913;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:30:49 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1L;
    public short sFld=-29249;
    public static float fFld=-46.14F;
    public static boolean bFld=false;
    public float fArrFld[]=new float[N];
    public static volatile long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 12L);
        FuzzerUtils.init(Test.iArrFld, -42965);
        FuzzerUtils.init(Test.dArrFld, 0.48171);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public long lMeth(int i4) {


        fArrFld[(i4 >>> 1) % N] += ((i4--) * ((sFld--) + (i4 + i4)));
        long meth_res = i4;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth() {

        int i10=41874;

        Test.instanceCount |= i10;
        long meth_res = i10;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i9) {

        int i11=2, i12=56679, i13=-20597, i14=1, i15=-124, i16=2, iArr[]=new int[N];
        boolean b=true;
        float f1=0.838F, f2=2.114F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-124);
        FuzzerUtils.init(iArr, -38029);

        i9 &= (int)(iMeth() + Test.instanceCount);
        for (i11 = 7; 154 > i11; i11 += 2) {
            for (i13 = 21; i13 > 1; i13--) {
                byArr[i11] -= (byte)i9;
                iArr = iArr;
                for (i15 = 2; i15 > 1; i15 -= 2) {
                    b = b;
                    Test.instanceCount = i12;
                    i9 += (((i15 * f1) + i11) - f1);
                    switch ((((186 >>> 1) % 2) * 5) + 92) {
                    case 102:
                        i14 = -6;
                        break;
                    case 96:
                        f2 -= i15;
                        i16 -= i13;
                        i14 += i15;
                        break;
                    default:
                        i14 = i12;
                    }
                }
            }
        }
        vMeth1_check_sum += i9 + i11 + i12 + i13 + i14 + i15 + i16 + (b ? 1 : 0) + Float.floatToIntBits(f1) +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i5, int i6) {

        int i7=249, i8=74, i17=-240, i18=-18380, i19=-5106, i20=55908, iArr1[]=new int[N];
        double d=0.120431;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr1, 29482);
        FuzzerUtils.init(fArr, -119.198F);

        for (i7 = 11; i7 < 228; ++i7) {
            vMeth1(i5);
        }
        for (i17 = 6; i17 < 358; i17 += 2) {
            i6 >>= i5;
            i5 += i7;
            d -= i5;
        }
        for (i19 = 11; i19 < 262; i19++) {
            iArr1[i19] <<= i6;
            i20 ^= i8;
            Test.fFld = i18;
            if (true) break;
            fArr[i19 + 1] -= i17;
        }
        fArr[(i7 >>> 1) % N] += i18;
        i20 -= -66;
        Test.fFld += (float)d;
        vMeth_check_sum += i5 + i6 + i7 + i8 + i17 + i18 + Double.doubleToLongBits(d) + i19 + i20 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=2, i1=-2, i2=-37827, i3=142, i21=-2, i22=0, i23=5008, i24=48317, i25=-111, i26=698;
        float f=0.122F, f3=106.38F;
        byte by=71;
        double d1=0.77595;
        long l=8380915451424801943L;

        for (i = 8; i < 128; i++) {
            for (i2 = 3; i2 < 209; i2 += 2) {
                Test.instanceCount -= (long)(--f);
                Test.instanceCount -= Math.min(i1, i3 + (++i3));
                try {
                    i3 = (i3 / -693835720);
                    i1 = (7003 % i2);
                    i1 = (253 / i);
                } catch (ArithmeticException a_e) {}
                i1 = (int)((-(12L - (i - by))) + Math.max(lMeth(i), 135L));
                i3 = (int)(i3 * (fArrFld[i + 1] *= (++i1)));
            }
            vMeth(i3, -14);
            i1 = i;
            d1 += i3;
            sFld -= (short)-22846;
            Test.instanceCount = i1;
            for (i21 = 13; i21 < 209; ++i21) {
                i22 = (int)Test.instanceCount;
                Test.lArrFld[i - 1] -= i3;
                if (Test.bFld) continue;
                Test.instanceCount = i2;
                i22 -= i22;
                for (f3 = 1; 2 > f3; f3++) {
                    i22 = 1;
                    Test.lArrFld[i] -= i2;
                }
            }
            Test.iArrFld[i] *= 13;
            for (l = 12; 209 > l; l++) {
                for (i25 = 1; i25 < 2; i25++) {
                    Test.iArrFld[i25 - 1] = i22;
                    Test.fFld += (i25 + i25);
                    i1 = i23;
                    fArrFld[(int)(l - 1)] = i22;
                    Test.dArrFld[i - 1] += f3;
                    f = i1;
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}