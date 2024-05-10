package tests.javafuzzer2073;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 08:37:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=175L;
    public static volatile boolean bFld=true;
    public static volatile short sFld=27030;
    public double dFld=0.114977;
    public static long lArrFld[][]=new long[N][N];
    public static volatile int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 4L);
        FuzzerUtils.init(Test.iArrFld, 6);
        FuzzerUtils.init(Test.iArrFld1, -8372);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth(int i5, long l) {


        i5 <<= (int)(l--);
        long meth_res = i5 + l;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(int i10, int i11) {

        int i12=23547, i13=-13, i14=-3236, i15=12;

        i10 <<= -8;
        i12 = 1;
        while (++i12 < 340) {
            Test.iArrFld[i12] *= i12;
        }
        i10 = i12;
        for (i13 = 12; 230 > i13; ++i13) {
            Test.iArrFld[i13 - 1] = i15;
            i11 += (i13 * i13);
        }
        long meth_res = i10 + i11 + i12 + i13 + i14 + i15;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i6) {

        int i7=-89, i8=-9, i9=-201, i16=-15, i17=-8, i18=212, iArr2[]=new int[N];
        boolean b=false;
        short s=-25881;

        FuzzerUtils.init(iArr2, -219);

        i7 = 1;
        do {
            for (i8 = 5; i8 > i7; --i8) {
                switch (((((++iArr2[i7 - 1]) >>> 1) % 2) * 5) + 69) {
                case 71:
                    Test.lArrFld[i8 - 1] = Test.lArrFld[i7];
                    Test.instanceCount = iMeth1(i7, -14);
                    i9 -= -10;
                    for (i16 = 1; i16 < 1; i16++) {
                        try {
                            i17 = (iArr2[i8] / i7);
                            iArr2[i8 - 1] = (i16 % -56485);
                            i17 = (1991164659 % i17);
                        } catch (ArithmeticException a_e) {}
                    }
                    break;
                case 73:
                    switch (((i7 % 7) * 5) + 18) {
                    case 52:
                        if (b) break;
                        i6 = i8;
                        break;
                    case 37:
                    case 45:
                        i9 += i8;
                        i18 = 1;
                        do {
                            i17 = i16;
                            i9 = i7;
                        } while ((i18 -= 2) > 0);
                        break;
                    case 39:
                        i9 = -91;
                        break;
                    case 23:
                        s >>= (short)Test.instanceCount;
                    case 32:
                        s >>>= (short)i17;
                        break;
                    case 21:
                        i17 -= i8;
                        break;
                    default:
                        try {
                            i17 = (-1323886943 % i7);
                            i9 = (Test.iArrFld[i7] % 1950499497);
                            i9 = (i16 / -123);
                        } catch (ArithmeticException a_e) {}
                    }
                    break;
                default:
                    if (i9 != 0) {
                    }
                }
            }
        } while (++i7 < 325);
        long meth_res = i6 + i7 + i8 + i9 + i16 + i17 + (b ? 1 : 0) + i18 + s + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i2) {

        int i3=-3, i4=-246, i19=51043, i20=245, i21=-133, iArr1[]=new int[N];
        byte by=31;
        double dArr[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(dArr, 1.83654);
        FuzzerUtils.init(lArr, -8943865608139059507L);
        FuzzerUtils.init(iArr1, -52035);

        for (i3 = 12; i3 < 398; ++i3) {
            dArr[(i2 >>> 1) % N] += (i2++);
            lArr[i3 + 1] = iMeth(iMeth(iArr1[i3 + 1]--, Test.instanceCount), lMeth(i4));
            Test.bFld = Test.bFld;
            i19 = 1;
            do {
                i2 = i2;
                iArr1[i3 - 1] = i19;
                if (Test.bFld) continue;
                i2 += i19;
                for (i20 = 1; i20 < 1; ++i20) {
                    switch ((((-46 >>> 1) % 1) * 5) + 33) {
                    case 37:
                        by += (byte)i20;
                        i2 <<= 11519;
                        i21 += (int)(75.72F + (i20 * i20));
                        i2 -= (int)Test.instanceCount;
                        break;
                    default:
                        by += (byte)(i20 + Test.instanceCount);
                    }
                }
            } while (++i19 < 4);
        }
        vMeth_check_sum += i2 + i3 + i4 + i19 + i20 + i21 + by + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=13, i1=254, i22=-62925, i23=9, i24=227, i25=-212, i26=-35415, i27=-5, i28=14, iArr[][]=new int[N][N];
        float f=39.349F;

        FuzzerUtils.init(iArr, -11);

        iArr[(i >>> 1) % N][(i >>> 1) % N] /= (int)(i | 1);
        i1 = 1;
        do {
            vMeth(-211);
            i >>>= -5;
            for (i22 = i1; 70 > i22; i22++) {
                switch (((i22 % 3) * 5) + 110) {
                case 117:
                    Test.sFld <<= (short)i23;
                    for (i24 = 1; i24 < 1; ++i24) {
                        Test.instanceCount = i23;
                        i25 *= i24;
                        i25 = i23;
                    }
                    iArr[i1 + 1][i1 - 1] += (int)Test.instanceCount;
                    i += (int)f;
                    break;
                case 121:
                    dFld *= i25;
                    i25 *= 93;
                    for (i26 = i22; i26 < 1; i26++) {
                        i27 = Test.sFld;
                        i27 += i26;
                        Test.iArrFld1[i22] += i24;
                        i = (int)Test.instanceCount;
                        i27 = (int)Test.instanceCount;
                        i25 -= i;
                    }
                    Test.instanceCount += (i22 * i22);
                case 122:
                    Test.iArrFld1[i1 + 1] <<= (int)Test.instanceCount;
                    i28 = 1;
                    while (++i28 < 1) {
                        switch ((i22 % 2) + 91) {
                        case 91:
                            i23 = i28;
                            i25 *= i28;
                            Test.instanceCount >>= i28;
                            iArr[i22 + 1][i28 + 1] = (int)Test.instanceCount;
                            break;
                        case 92:
                        default:
                            f -= i;
                        }
                    }
                    break;
                }
            }
        } while (++i1 < 359);



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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}