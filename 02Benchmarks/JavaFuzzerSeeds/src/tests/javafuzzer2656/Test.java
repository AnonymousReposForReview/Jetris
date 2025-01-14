package tests.javafuzzer2656;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 18:05:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-45142L;
    public static float fFld=-104.653F;
    public short sFld=6467;
    public int iFld=-213;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i4) {


        Test.instanceCount = Test.instanceCount;
        long meth_res = i4;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(short s1) {

        int i1=-163, i2=-147, i3=-233, i5=23813, i6=54384, i7=160, i8=134, iArr[]=new int[N];
        byte by=-34;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -221);
        FuzzerUtils.init(lArr, -60L);

        Test.fFld -= (i1 - ((Test.instanceCount - 27024) + (Test.instanceCount <<= 182)));
        for (i2 = 10; 215 > i2; ++i2) {
            Test.instanceCount += (iArr[i2 + 1] - (-(i1--)));
            by = (byte)(((i1 + Test.instanceCount) + Math.abs(Test.instanceCount)) + iMeth(i2));
            for (i5 = 1; i5 < 8; i5++) {
                for (i7 = 1; 2 > i7; ++i7) {
                    switch ((i5 % 3) + 90) {
                    case 90:
                        i8 = 93;
                        Test.instanceCount += (i7 ^ i2);
                    case 91:
                        i8 += (i7 - i6);
                        Test.fFld = i6;
                    case 92:
                        lArr = lArr;
                        break;
                    default:
                        i8 += (39 + (i7 * i7));
                        s1 *= (short)43.71F;
                    }
                    Test.instanceCount += (i7 + Test.fFld);
                }
            }
        }
        vMeth1_check_sum += s1 + i1 + i2 + i3 + by + i5 + i6 + i7 + i8 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(short s) {

        int i=-13, i9=-114, i10=11, i11=145, i12=-28520;
        double d=0.41544;

        i *= i;
        vMeth1(s);
        Test.instanceCount *= i;
        Test.instanceCount -= s;
        for (i9 = 3; 149 > i9; i9++) {
            for (i11 = i9; i11 < 11; i11++) {
                d = 1;
                do {
                    Test.fFld += (float)(((d * i11) + i11) - i);
                    i = i10;
                    i += (int)(d * i9);
                    Test.fFld *= -213;
                    i12 = i11;
                    i12 -= i9;
                } while (++d < 1);
                i10 = i11;
                i10 += (int)d;
            }
        }
        vMeth_check_sum += s + i + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d);
    }

    public void mainTest(String[] strArr1) {

        int i13=-2, i14=-2, i15=8, i16=43646, i17=-18178;
        double d1=2.52039, dArr[][]=new double[N][N];
        long l=2211644646L, lArr1[]=new long[N];
        boolean b=false;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 1.628F);
        FuzzerUtils.init(lArr1, 156L);
        FuzzerUtils.init(dArr, 7.94352);

        vMeth(sFld);
        fArr[(-3 >>> 1) % N][(i13 >>> 1) % N] += -26;
        i14 = 1;
        while (++i14 < 246) {
            i15 = 102;
            while (--i15 > 0) {
                i13 += (176 + (i15 * i15));
                if (b) {
                    Test.instanceCount = i15;
                    i13 *= (int)d1;
                    i13 = i15;
                } else if (b) {
                    for (i16 = 1; i16 < 1; i16++) {
                        switch ((i15 % 7) + 1) {
                        case 1:
                            i17 *= (int)d1;
                            lArr1[i15 + 1] >>= i15;
                            Test.fFld -= Test.fFld;
                            i13 = (int)Test.fFld;
                            break;
                        case 2:
                            dArr[i15 - 1][i14] += -110.548F;
                            i17 >>>= i14;
                            d1 += i13;
                            break;
                        case 3:
                            try {
                                iArrFld[i15 + 1] = (iArrFld[i16 + 1] / 13344);
                                i13 = (i14 / i17);
                                i13 = (i17 % i13);
                            } catch (ArithmeticException a_e) {}
                            l *= -3080329424919856898L;
                        case 4:
                            i13 += i13;
                            Test.fFld += i16;
                            Test.fFld -= 64247L;
                            i13 -= (int)Test.instanceCount;
                            break;
                        case 5:
                            l = 136;
                            i17 = (int)1.2020;
                            i13 += (int)83.61139;
                            break;
                        case 6:
                            Test.instanceCount <<= i14;
                            i17 = (int)Test.instanceCount;
                            i17 += (((i16 * Test.fFld) + Test.instanceCount) - l);
                            break;
                        case 7:
                            i17 -= sFld;
                        }
                    }
                } else if (b) {
                    i13 += (((i15 * Test.instanceCount) + Test.instanceCount) - iFld);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
