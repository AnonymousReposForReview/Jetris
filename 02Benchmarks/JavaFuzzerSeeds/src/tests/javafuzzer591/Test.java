package tests.javafuzzer591;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:16:03 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-9891L;
    public static float fFld=-55.257F;
    public static volatile byte byFld=19;
    public double dFld=10.16704;
    public boolean bFld=true;
    public double dArrFld[]=new double[N];

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, long l, int i5) {

        double d1=107.61553, dArr[][]=new double[N][N];
        int i7=8938, i8=3017, i9=2, i10=-26015, i11=4, iArr1[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -23004);
        FuzzerUtils.init(lArr, 160L);
        FuzzerUtils.init(dArr, 1.56072);

        for (int i6 : iArr1) {
            d1 *= i4;
            i4 -= (int)l;
            i4 = (int)Test.instanceCount;
            for (i7 = 1; i7 < 4; ++i7) {
                try {
                    iArr1[i7 - 1] = (i8 % 195);
                    i6 = (i5 % -61172);
                    i6 = (iArr1[i7 + 1] / i8);
                } catch (ArithmeticException a_e) {}
                Test.byFld += (byte)i7;
                lArr[i7] <<= i8;
                i9 -= i7;
                i4 <<= Test.byFld;
                i6 += (int)(-40351L + (i7 * i7));
                i10 = 1;
                while (++i10 < 2) {
                    dArr[i10 - 1][i7] += 2.649F;
                }
                iArr1[i7 - 1] = i10;
                i6 += (((i7 * i11) + i5) - l);
            }
        }
        vMeth1_check_sum += i4 + l + i5 + Double.doubleToLongBits(d1) + i7 + i8 + i9 + i10 + i11 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth() {

        int i3=0;

        i3 = (-i3);
        vMeth1(i3, Test.instanceCount, i3);
        vMeth_check_sum += i3;
    }

    public static long lMeth(double d) {

        int i12=232, i13=0, i14=49927, i15=11, i16=-64095, i17=30250, iArr2[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr2, 3);

        vMeth();
        Test.byFld >>= (byte)i12;
        i13 = 1;
        do {
            i12 <<= -4793;
            i12 = i13;
            for (i14 = 1; i14 < 7; ++i14) {
                for (i16 = 1; i16 < 2; ++i16) {
                    Test.fFld += (i16 + i14);
                    i15 = Test.byFld;
                    Test.instanceCount -= i14;
                    i12 -= (int)2072218007L;
                    iArr2[(i17 >>> 1) % N] = (int)Test.fFld;
                    d += i13;
                    b = b;
                    i12 *= i17;
                }
            }
        } while (++i13 < 241);
        long meth_res = Double.doubleToLongBits(d) + i12 + i13 + i14 + i15 + i16 + i17 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by=40;
        int i=-6, i1=22194, i2=20522, i18=33949, i19=-20, i20=9, i21=61, i22=1, i23=-189, iArr[][]=new int[N][N];
        double d2=3.112965, d3=75.32029;

        FuzzerUtils.init(iArr, -72);

        by = (byte)(Test.instanceCount += (long)((by + by) - (by - Test.fFld)));
        Test.instanceCount = i;
        for (i1 = 5; i1 < 141; i1++) {
            iArr[i1 - 1][i1 - 1] = (int)((++i2) + (dArrFld[i1 - 1] * (-lMeth(dFld))));
        }
        for (d2 = 2; d2 < 297; d2++) {
            Test.instanceCount = i;
            try {
                i2 = (27808 % i1);
                i18 = (-62875301 % iArr[(int)(d2)][(32637 >>> 1) % N]);
                i18 = (i / i1);
            } catch (ArithmeticException a_e) {}
            for (i19 = (int)(d2); i19 < 85; i19++) {
                for (i21 = 1; i21 < 1; ++i21) {
                    i22 += i18;
                    Test.byFld = (byte)-85.60520;
                    Test.instanceCount += (i21 ^ i18);
                    switch (((i21 >>> 1) % 3) + 33) {
                    case 33:
                        by += (byte)Test.instanceCount;
                        break;
                    case 34:
                        bFld = bFld;
                    case 35:
                        i18 += (((i21 * i21) + Test.instanceCount) - i22);
                        iArr[i21 - 1][(int)(d2)] += i18;
                        Test.fFld += i19;
                        Test.instanceCount += (i21 - Test.fFld);
                        break;
                    }
                    i2 -= (int)Test.instanceCount;
                    i20 = -42;
                    if (true) break;
                    Test.instanceCount = i1;
                    Test.instanceCount += (((i21 * i22) + Test.instanceCount) - i2);
                    i2 -= (int)Test.instanceCount;
                }
                iArr[(int)(d2)][(int)(d2 - 1)] = i19;
                for (d3 = 1; d3 < 1; ++d3) {
                    dFld += i21;
                    i22 += (int)Test.instanceCount;
                    iArr[(int)(d2)][(int)(d2 - 1)] >>= i23;
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
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
